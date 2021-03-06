/*
 * Copyright (c) 1997, 2007, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package com.neo.crypto.provider;

import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.KeyRep;

import javax.crypto.SecretKey;

import com.neo.crypto.provider.engine.ARIACrypt;

/**
 * This class represents a ARIA key.
 *
 * @author Jan Luehe
 *
 */

final class ARIAKey implements SecretKey {

    private byte[] key;

    /**
     * Uses the first 8 bytes of the given key as the ARIA key.
     *
     * @param key the buffer with the ARIA key bytes.
     *
     * @exception InvalidKeyException if less than 8 bytes are available for
     * the key.
     */
    ARIAKey(byte[] key) throws InvalidKeyException {
        this(key, 0, key.length);
    }

    /**
     * Uses the first 8 bytes in <code>key</code>, beginning at
     * <code>offset</code>, as the ARIA key
     *
     * @param key the buffer with the ARIA key bytes.
     * @param offset the offset in <code>key</code>, where the ARIA key bytes
     * start.
     *
     * @exception InvalidKeyException if less than 8 bytes are available for
     * the key.
     */
    ARIAKey(byte[] key, int offset,int length) throws InvalidKeyException {
    	
        if (key == null || ((length) == 0) ||
                (!ARIACrypt.isKeySizeValid(length))) {
                throw new InvalidParameterException
                    ("Wrong keysize: must be equal to 128, 192 or 256");
        }
        
        this.key = new byte[length];
        System.arraycopy(key, offset, this.key, 0, length);
    }

    public byte[] getEncoded() {
        // Return a copy of the key, rather than a reference,
        // so that the key data cannot be modified from outside
        return (byte[])this.key.clone();
    }

    public String getAlgorithm() {
        return "ARIA";
    }

    public String getFormat() {
        return "RAW";
    }

    /**
     * Calculates a hash code value for the object.
     * Objects that are equal will also have the same hashcode.
     */
    public int hashCode() {
        int retval = 0;
        for (int i = 1; i < this.key.length; i++) {
            retval += this.key[i] * i;
        }
        return(retval ^= "ARIA".hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof SecretKey))
            return false;

        String thatAlg = ((SecretKey)obj).getAlgorithm();
        if (!(thatAlg.equalsIgnoreCase("ARIA")))
            return false;

        byte[] thatKey = ((SecretKey)obj).getEncoded();
        boolean ret = java.util.Arrays.equals(this.key, thatKey);
        java.util.Arrays.fill(thatKey, (byte)0x00);
        return ret;
    }

    /**
     * readObject is called to restore the state of this key from
     * a stream.
     */
    private void readObject(java.io.ObjectInputStream s)
         throws java.io.IOException, ClassNotFoundException
    {
        s.defaultReadObject();
        key = (byte[])key.clone();
    }

    /**
     * Replace the ARIA key to be serialized.
     *
     * @return the standard KeyRep object to be serialized
     *
     * @throws java.io.ObjectStreamException if a new object representing
     * this ARIA key could not be created
     */
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new KeyRep(KeyRep.Type.SECRET,
                        getAlgorithm(),
                        getFormat(),
                        getEncoded());
    }

    /**
     * Ensures that the bytes of this key are
     * set to zero when there are no more references to it.
     */
    protected void finalize() throws Throwable {
        try {
            if (this.key != null) {
                java.util.Arrays.fill(this.key, (byte)0x00);
                this.key = null;
            }
        } finally {
            super.finalize();
        }
    }
}
