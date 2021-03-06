/*
 * Copyright (c) 2001, 2006, Oracle and/or its affiliates. All rights reserved.
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

package com.neo.security.util;

/**
 * <p> This class represents the <code>ResourceBundle</code>
 * for javax.security.auth and sun.security.
 *
 * @version 1.33, 12/06/05
 */
public class Resources_pt_BR extends java.util.ListResourceBundle {

    private static final Object[][] contents = {

    // shared (from jarsigner)
    {" ", " "},
    {"  ", "  "},
    {"      ", "      "},
    {", ", ", "},
    // shared (from keytool)
    {"\n", "\n"},
    {"*******************************************",
        "*******************************************"},
    {"*******************************************\n\n",
        "*******************************************\n\n"},

    // keytool
    {"keytool error: ", "erro de keytool: "},
    {"Illegal option:  ", "Op\u00e7\u00e3o ilegal:  "},
        {"Try keytool -help","Tentar keytool -help"},
        {"Command option <flag> needs an argument.", "A op\u00e7\u00e3o de comando {0} precisa de um argumento."},
        {"Warning:  Different store and key passwords not supported for PKCS12 KeyStores. Ignoring user-specified <command> value.",
                "Aviso:  senhas de chave e de armazenamento diferentes n\u00e3o suportadas para KeyStores PKCS12. Ignorando valor {0} especificado pelo usu\u00e1rio."},
    {"-keystore must be NONE if -storetype is {0}",
        "-keystore deve ser NONE se -storetype for {0}"},
        {"Too may retries, program terminated",
                 "N\u00famero de tentativas excedido, programa finalizado"},
    {"-storepasswd and -keypasswd commands not supported if -storetype is {0}",
        "comandos -storepasswd e -keypasswd n\u00e3o suportados se -storetype for {0}"},
    {"-keypasswd commands not supported if -storetype is PKCS12",
        "comandos -keypasswd n\u00e3o suportados se -storetype for PKCS12"},
    {"-keypass and -new can not be specified if -storetype is {0}",
        "-keypass e -new n\u00e3o podem ser especificados se -storetype for {0}"},
    {"if -protected is specified, then -storepass, -keypass, and -new must not be specified",
        "se -protected estiver especificado, ent\u00e3o -storepass, -keypass e -new n\u00e3o devem ser especificados"},
    {"if -srcprotected is specified, then -srcstorepass and -srckeypass must not be specified",
        "se -srcprotected estiver especificado, ent\u00e3o -srcstorepass e -srckeypass n\u00e3o devem ser especificados"},
    {"if keystore is not password protected, then -storepass, -keypass, and -new must not be specified",
        "se o armazenamento de chaves n\u00e3o estiver protegido por senha, ent\u00e3o -storepass, -keypass e -new n\u00e3o devem ser especificados"},
    {"if source keystore is not password protected, then -srcstorepass and -srckeypass must not be specified",
        "se o armazenamento de chaves de origem n\u00e3o estiver protegido por senha, ent\u00e3o -srcstorepass e -srckeypass n\u00e3o devem ser especificados"},
    {"Validity must be greater than zero",
        "A validade deve ser maior do que zero"},
    {"provName not a provider", "{0} n\u00e3o \u00e9 um fornecedor"},
    {"Usage error: no command provided", "Erro de uso: nenhum comando fornecido"},
    {"Usage error, <arg> is not a legal command", "Erro de uso, {0} n\u00e3o \u00e9 um comando legal"},
    {"Source keystore file exists, but is empty: ", "O arquivo de armazenamento de chaves de origem existe, mas est\u00e1 vazio: "},
    {"Please specify -srckeystore", "Especifique -srckeystore"},
    {"Must not specify both -v and -rfc with 'list' command",
        "N\u00e3o devem ser especificados -v e -rfc com o comando 'list'"},
    {"Key password must be at least 6 characters",
        "A senha da chave deve ter como m\u00ednimo 6 caracteres"},
    {"New password must be at least 6 characters",
        "A nova senha deve ter como m\u00ednimo 6 caracteres"},
    {"Keystore file exists, but is empty: ",
        "O arquivo de armazenamento de chaves existe, mas est\u00e1 vazio: "},
    {"Keystore file does not exist: ",
        "O arquivo de armazenamento de chaves n\u00e3o existe. "},
    {"Must specify destination alias", "Deve ser especificado um alias de destino"},
    {"Must specify alias", "Deve ser especificado um alias"},
    {"Keystore password must be at least 6 characters",
        "A senha do armazenamento de chaves deve ter como m\u00ednimo 6 caracteres"},
    {"Enter keystore password:  ", "Insira a senha do armazenamento de chaves:  "},
    {"Enter source keystore password:  ", "Insira a senha do armazenamento de chaves de origem:  "},
        {"Enter destination keystore password:  ", "Insira a senha do armazenamento de chaves de destino:  "},
    {"Keystore password is too short - must be at least 6 characters",
     "A senha do armazenamento de chaves \u00e9 muito curta - deve ter como m\u00ednimo 6 caracteres"},
        {"Unknown Entry Type", "Tipo de entrada desconhecido"},
        {"Too many failures. Alias not changed", "Excesso de falhas. Alias n\u00e3o alterado"},
        {"Entry for alias <alias> successfully imported.",
                 "Entrada do alias {0} importada com \u00eaxito."},
        {"Entry for alias <alias> not imported.", "Entrada do alias {0} n\u00e3o importada."},
        {"Problem importing entry for alias <alias>: <exception>.\nEntry for alias <alias> not imported.",
                 "Problema ao importar a entrada do {0}: {1}.\nEntrada do alias {0} n\u00e3o importada."},
        {"Import command completed:  <ok> entries successfully imported, <fail> entries failed or cancelled",
                 "Comando de importa\u00e7\u00e3o conclu\u00eddo:  {0} entradas importadas com \u00eaxito, {1} entradas falhas ou canceladas"},
        {"Warning: Overwriting existing alias <alias> in destination keystore",
                 "Aviso: substitui\u00e7\u00e3o de alias {0} existente no armazenamento de chaves de destino"},
        {"Existing entry alias <alias> exists, overwrite? [no]:  ",
                 "Entrada j\u00e1 existente no alias {0}, substituir? [n\u00e3o]:  "},
    {"Too many failures - try later", "Excesso de falhas - tentar mais tarde"},
    {"Certification request stored in file <filename>",
        "Solicita\u00e7\u00e3o de certificado armazenada no arquivo <{0}>"},
    {"Submit this to your CA", "Enviar \u00e0 CA"},
        {"if alias not specified, destalias, srckeypass, and destkeypass must not be specified",
            "se o alias n\u00e3o estiver especificado, destalias, srckeypass e destkeypass n\u00e3o devem ser especificados"},
    {"Certificate stored in file <filename>",
        "Certificado armazenado no arquivo <{0}>"},
    {"Certificate reply was installed in keystore",
        "Resposta do certificado foi instalada no armazenamento de chaves"},
    {"Certificate reply was not installed in keystore",
        "Resposta do certificado n\u00e3o foi instalada no armazenamento de chaves"},
    {"Certificate was added to keystore",
        "O certificado foi adicionado ao armazenamento de chaves"},
    {"Certificate was not added to keystore",
        "O certificado n\u00e3o foi adicionado ao armazenamento de chaves"},
    {"[Storing ksfname]", "[Armazenando {0}]"},
    {"alias has no public key (certificate)",
        "{0} n\u00e3o possui chave p\u00fablica (certificado)"},
    {"Cannot derive signature algorithm",
        "N\u00e3o \u00e9 poss\u00edvel obter algoritmo de assinatura"},
    {"Alias <alias> does not exist",
        "O alias <{0}> n\u00e3o existe"},
    {"Alias <alias> has no certificate",
        "O alias <{0}> n\u00e3o possui certificado"},
    {"Key pair not generated, alias <alias> already exists",
        "Par de chaves n\u00e3o gerado, o alias <{0}> j\u00e1 existe"},
    {"Cannot derive signature algorithm",
        "N\u00e3o \u00e9 poss\u00edvel obter algoritmo de assinatura"},
    {"Generating keysize bit keyAlgName key pair and self-signed certificate (sigAlgName) with a validity of validality days\n\tfor: x500Name",
                "Gerando o par de chaves {1} de {0} bit e o certificado autoassinado ({2}) com uma validade de {3} dias\n\tpara: {4}"},
    {"Enter key password for <alias>", "Inserir a senha da chave de <{0}>"},
    {"\t(RETURN if same as keystore password):  ",
        "\t(RETURN se for igual \u00e0 senha do armazenamento de chaves):  "},
    {"Key password is too short - must be at least 6 characters",
        "A senha da chave \u00e9 muito curta - deve ter como m\u00ednimo 6 caracteres"},
    {"Too many failures - key not added to keystore",
        "Excesso de falhas - chave n\u00e3o adicionada ao armazenamento de chaves"},
    {"Destination alias <dest> already exists",
        "O alias de destino <{0}> j\u00e1 existe"},
    {"Password is too short - must be at least 6 characters",
        "A senha \u00e9 muito curta - deve ter como m\u00ednimo 6 caracteres"},
    {"Too many failures. Key entry not cloned",
        "Excesso de falhas. Entrada da chave n\u00e3o clonada"},
    {"key password for <alias>", "senha da chave de <{0}>"},
    {"Keystore entry for <id.getName()> already exists",
        "A entrada do armazenamento de chaves de <{0}> j\u00e1 existe"},
    {"Creating keystore entry for <id.getName()> ...",
        "Criando entrada do armazenamento de chaves para <{0}> ..."},
    {"No entries from identity database added",
        "Nenhuma entrada adicionada do banco de dados de identidades"},
    {"Alias name: alias", "Nome do alias: {0}"},
    {"Creation date: keyStore.getCreationDate(alias)",
        "Data de cria\u00e7\u00e3o: {0,data}"},
    {"alias, keyStore.getCreationDate(alias), ",
        "{0}, {1,data}, "},
    {"alias, ", "{0}, "},
    {"Entry type: <type>", "Tipo de entrada: {0}"},
    {"Certificate chain length: ", "Comprimento da cadeia de certificados: "},
    {"Certificate[(i + 1)]:", "Certificado[{0,n\u00famero,inteiro}]:"},
    {"Certificate fingerprint (MD5): ", "Fingerprint (MD5) do certificado: "},
    {"Entry type: trustedCertEntry\n", "Tipo de entrada: trustedCertEntry\n"},
    {"trustedCertEntry,", "trustedCertEntry,"},
    {"Keystore type: ", "Tipo de armazenamento de chaves: "},
    {"Keystore provider: ", "Fornecedor de armazenamento de chaves: "},
    {"Your keystore contains keyStore.size() entry",
        "Seu armazenamento de chaves cont\u00e9m {0,n\u00famero,inteiro} entrada"},
    {"Your keystore contains keyStore.size() entries",
        "Seu armazenamento de chaves cont\u00e9m {0,n\u00famero,inteiro} entradas"},
    {"Failed to parse input", "Falha ao analisar a entrada"},
    {"Empty input", "Entrada vazia"},
    {"Not X.509 certificate", "N\u00e3o \u00e9 um certificado X.509"},
    {"Cannot derive signature algorithm",
        "N\u00e3o \u00e9 poss\u00edvel obter algoritmo de assinatura"},
    {"alias has no public key", "{0} n\u00e3o possui chave p\u00fablica"},
    {"alias has no X.509 certificate", "{0} n\u00e3o possui certificado X.509"},
    {"New certificate (self-signed):", "Novo certificado (autoassinado):"},
    {"Reply has no certificates", "A resposta n\u00e3o possui certificado"},
    {"Certificate not imported, alias <alias> already exists",
        "Certificado n\u00e3o importado, o alias <{0}> j\u00e1 existe"},
    {"Input not an X.509 certificate", "A entrada n\u00e3o \u00e9 um certificado X.509"},
    {"Certificate already exists in keystore under alias <trustalias>",
        "O certificado j\u00e1 existe no armazenamento de chaves no alias <{0}>"},
    {"Do you still want to add it? [no]:  ",
        "Ainda deseja adicion\u00e1-lo? [n\u00e3o]:  "},
    {"Certificate already exists in system-wide CA keystore under alias <trustalias>",
        "O certificado j\u00e1 existe no armazenamento de chaves de CA em todo o sistema no alias <{0}>"},
    {"Do you still want to add it to your own keystore? [no]:  ",
        "Ainda deseja adicion\u00e1-lo ao seu pr\u00f3prio armazenamento de chaves? [n\u00e3o]:  "},
    {"Trust this certificate? [no]:  ", "Confiar neste certificado? [n\u00e3o]:  "},
    {"YES", "SIM"},
    {"New prompt: ", "Nova {0}: "},
    {"Passwords must differ", "As senhas devem ser diferentes"},
    {"Re-enter new prompt: ", "Insira novamente a nova {0}: "},
    {"Re-enter new password: ", "Insira novamente a nova senha: "},
    {"They don't match. Try again", "Elas n\u00e3o correspondem. Tente novamente"},
    {"Enter prompt alias name:  ", "Insira o nome do alias {0}:  "},
        {"Enter new alias name\t(RETURN to cancel import for this entry):  ",
                 "Insira o novo nome do alias\t(RETURN para cancelar a importa\u00e7\u00e3o desta entrada):  "},
    {"Enter alias name:  ", "Insira o nome do alias:  "},
    {"\t(RETURN if same as for <otherAlias>)",
        "\t(RETURN se for igual ao de <{0}>)"},
    {"*PATTERN* printX509Cert",
        "Propriet\u00e1rio: {0}\nEmissor: {1}\nN\u00famero de s\u00e9rie: {2}\nV\u00e1lido de: {3} a: {4}\nFingerprints do certificado:\n\t MD5:  {5}\n\t SHA1: {6}\n\t Nome do algoritmo de assinatura: {7}\n\t Vers\u00e3o: {8}"},
    {"What is your first and last name?",
        "Qual \u00e9 o seu nome e o seu sobrenome?"},
    {"What is the name of your organizational unit?",
        "Qual \u00e9 o nome da sua unidade organizacional?"},
    {"What is the name of your organization?",
        "Qual \u00e9 o nome da sua empresa?"},
    {"What is the name of your City or Locality?",
        "Qual \u00e9 o nome da sua cidade ou localidade?"},
    {"What is the name of your State or Province?",
        "Qual \u00e9 o nome do seu estado ou munic\u00edpio?"},
    {"What is the two-letter country code for this unit?",
        "Quais s\u00e3o as duas letras do c\u00f3digo do pa\u00eds desta unidade?"},
    {"Is <name> correct?", "{0} \u00e9 correto?"},
    {"no", "n\u00e3o"},
    {"yes", "sim"},
    {"y", "s"},
    {"  [defaultValue]:  ", "  [{0}]:  "},
    {"Alias <alias> has no key",
        "O alias <{0}> n\u00e3o possui chave"},
        {"Alias <alias> references an entry type that is not a private key entry.  The -keyclone command only supports cloning of private key entries",
                 "O alias <{0}> faz refer\u00eancia a um tipo de entrada que n\u00e3o \u00e9 uma entrada de chave privada.  O comando -keyclone oferece suporte somente \u00e0 clonagem de entradas de chave privada"},

    {"*****************  WARNING WARNING WARNING  *****************",
        "*****************  AVISO AVISO AVISO  *****************"},

        // Translators of the following 5 pairs, ATTENTION:
        // the next 5 string pairs are meant to be combined into 2 paragraphs,
        // 1+3+4 and 2+3+5. make sure your translation also does.
        {"* The integrity of the information stored in your keystore  *",
        "* A integridade das informa\u00e7\u00f5es armazenadas no seu armazenamento de chaves  *"},
        {"* The integrity of the information stored in the srckeystore*",
            "* A integridade das informa\u00e7\u00f5es armazenadas no srckeystore*"},
    {"* has NOT been verified!  In order to verify its integrity, *",
        "* N\u00c3O foi verificada!  Para verificar a integridade destas informa\u00e7\u00f5es, *"},
    {"* you must provide your keystore password.                  *",
        "* voc\u00ea deve fornecer a senha do seu armazenamento de chaves.                  *"},
        {"* you must provide the srckeystore password.                *",
            "* voc\u00ea deve fornecer a senha do srckeystore.                  *"},


    {"Certificate reply does not contain public key for <alias>",
        "A resposta do certificado n\u00e3o cont\u00e9m a chave p\u00fablica de <{0}>"},
    {"Incomplete certificate chain in reply",
        "Cadeia de certificados incompleta na resposta"},
    {"Certificate chain in reply does not verify: ",
        "A cadeia de certificados da resposta n\u00e3o verifica: "},
    {"Top-level certificate in reply:\n",
        "Certificado de n\u00edvel superior na resposta:\n"},
    {"... is not trusted. ", "... n\u00e3o \u00e9 confi\u00e1vel. "},
    {"Install reply anyway? [no]:  ", "Instalar resposta assim mesmo? [n\u00e3o]:  "},
    {"NO", "N\u00c3O"},
    {"Public keys in reply and keystore don't match",
        "As chaves p\u00fablicas da resposta e do armazenamento de chaves n\u00e3o correspondem"},
    {"Certificate reply and certificate in keystore are identical",
        "O certificado da resposta e o certificado do armazenamento de chaves s\u00e3o id\u00eanticos"},
    {"Failed to establish chain from reply",
        "Falha ao estabelecer a cadeia a partir da resposta"},
    {"n", "n"},
    {"Wrong answer, try again", "Resposta errada, tente novamente"},
    {"Secret key not generated, alias <alias> already exists",
        "Chave secreta n\u00e3o gerada, o alias <{0}> j\u00e1 existe"},
        {"Please provide -keysize for secret key generation",
                "Forne\u00e7a o -keysize para a gera\u00e7\u00e3o da chave secreta"},
    {"keytool usage:\n", "uso de keytool:\n"},

        {"Extensions: ", "Extens\u00f5es: "},

    {"-certreq     [-v] [-protected]",
        "-certreq     [-v] [-protected]"},
    {"\t     [-alias <alias>] [-sigalg <sigalg>]",
        "\t     [-alias <alias>] [-sigalg <sigalg>]"},
    {"\t     [-file <csr_file>] [-keypass <keypass>]",
        "\t     [-file <csr_file>] [-keypass <keypass>]"},
    {"\t     [-keystore <keystore>] [-storepass <storepass>]",
        "\t     [-keystore <keystore>] [-storepass <storepass>]"},
    {"\t     [-storetype <storetype>] [-providername <name>]",
        "\t     [-storetype <storetype>] [-providername <name>]"},
    {"\t     [-providerclass <provider_class_name> [-providerarg <arg>]] ...",
        "\t     [-providerclass <provider_class_name> [-providerarg <arg>]] ..."},
        {"\t     [-providerpath <pathlist>]",
                "\t     [-providerpath <pathlist>]"},
    {"-delete      [-v] [-protected] -alias <alias>",
        "-delete      [-v] [-protected] -alias <alias>"},
    /** rest is same as -certreq starting from -keystore **/

        //{"-export      [-v] [-rfc] [-protected]",
        //       "-export      [-v] [-rfc] [-protected]"},
    {"-exportcert  [-v] [-rfc] [-protected]",
        "-exportcert  [-v] [-rfc] [-protected]"},
    {"\t     [-alias <alias>] [-file <cert_file>]",
        "\t     [-alias <alias>] [-file <cert_file>]"},
    /** rest is same as -certreq starting from -keystore **/

        //{"-genkey      [-v] [-protected]",
        //        "-genkey      [-v] [-protected]"},
    {"-genkeypair  [-v] [-protected]",
        "-genkeypair  [-v] [-protected]"},
    {"\t     [-alias <alias>]", "\t     [-alias <alias>]"},
    {"\t     [-keyalg <keyalg>] [-keysize <keysize>]",
        "\t     [-keyalg <keyalg>] [-keysize <keysize>]"},
    {"\t     [-sigalg <sigalg>] [-dname <dname>]",
        "\t     [-sigalg <sigalg>] [-dname <dname>]"},
    {"\t     [-validity <valDays>] [-keypass <keypass>]",
        "\t     [-validity <valDays>] [-keypass <keypass>]"},
    /** rest is same as -certreq starting from -keystore **/

    {"-genseckey   [-v] [-protected]",
        "-genseckey   [-v] [-protected]"},
    /** rest is same as -certreq starting from -keystore **/

    {"-help", "-help"},
    //{"-identitydb  [-v] [-protected]",
    //    "-identitydb  [-v] [-protected]"},
    //{"\t     [-file <idb_file>]", "\t     [-file <idb_file>]"},
    /** rest is same as -certreq starting from -keystore **/

        //{"-import      [-v] [-noprompt] [-trustcacerts] [-protected]",
        //       "-import      [-v] [-noprompt] [-trustcacerts] [-protected]"},
    {"-importcert  [-v] [-noprompt] [-trustcacerts] [-protected]",
        "-importcert  [-v] [-noprompt] [-trustcacerts] [-protected]"},
    {"\t     [-alias <alias>]", "\t     [-alias <alias>]"},
        {"\t     [-alias <alias>] [-keypass <keypass>]",
            "\t     [-alias <alias>] [-keypass <keypass>]"},
    {"\t     [-file <cert_file>] [-keypass <keypass>]",
        "\t     [-file <cert_file>] [-keypass <keypass>]"},
    /** rest is same as -certreq starting from -keystore **/

    {"-importkeystore [-v] ",
                "-importkeystore [-v] "},
    {"\t     [-srckeystore <srckeystore>] [-destkeystore <destkeystore>]",
                "\t     [-srckeystore <srckeystore>] [-destkeystore <destkeystore>]"},
    {"\t     [-srcstoretype <srcstoretype>] [-deststoretype <deststoretype>]",
                "\t     [-srcstoretype <srcstoretype>] [-deststoretype <deststoretype>]"},
    {"\t     [-srcprotected] [-destprotected]",
                "\t     [-srcprotected] [-destprotected]"},
        {"\t     [-srcstorepass <srcstorepass>] [-deststorepass <deststorepass>]",
                "\t     [-srcstorepass <srcstorepass>] [-deststorepass <deststorepass>]"},
        {"\t     [-srcprovidername <srcprovidername>]\n\t     [-destprovidername <destprovidername>]",  // line too long, split to 2
                 "\t     [-srcprovidername <srcprovidername>]\n\t     [-destprovidername <destprovidername>]"},
    {"\t     [-srcalias <srcalias> [-destalias <destalias>]",
                "\t     [-srcalias <srcalias> [-destalias <destalias>]"},
    {"\t       [-srckeypass <srckeypass>] [-destkeypass <destkeypass>]]",
                "\t       [-srckeypass <srckeypass>] [-destkeypass <destkeypass>]]"},
        {"\t     [-noprompt]", "\t     [-noprompt]"},
    /** rest is same as -certreq starting from -keystore **/

        {"-changealias [-v] [-protected] -alias <alias> -destalias <destalias>",
                "-changealias [-v] [-protected] -alias <alias> -destalias <destalias>"},
        {"\t     [-keypass <keypass>]", "\t     [-keypass <keypass>]"},

    //{"-keyclone    [-v] [-protected]",
    //    "-keyclone    [-v] [-protected]"},
    //{"\t     [-alias <alias>] -dest <dest_alias>",
    //    "\t     [-alias <alias>] -dest <dest_alias>"},
    //{"\t     [-keypass <keypass>] [-new <new_keypass>]",
    //    "\t     [-keypass <keypass>] [-new <new_keypass>]"},
    /** rest is same as -certreq starting from -keystore **/

    {"-keypasswd   [-v] [-alias <alias>]",
        "-keypasswd   [-v] [-alias <alias>]"},
    {"\t     [-keypass <old_keypass>] [-new <new_keypass>]",
        "\t     [-keypass <old_keypass>] [-new <new_keypass>]"},
    /** rest is same as -certreq starting from -keystore **/

    {"-list        [-v | -rfc] [-protected]",
        "-list        [-v | -rfc] [-protected]"},
    {"\t     [-alias <alias>]", "\t     [-alias <alias>]"},
    /** rest is same as -certreq starting from -keystore **/

    {"-printcert   [-v] [-file <cert_file>]",
        "-printcert   [-v] [-file <cert_file>]"},

    //{"-selfcert    [-v] [-protected]",
    //    "-selfcert    [-v] [-protected]"},
    {"\t     [-alias <alias>]", "\t     [-alias <alias>]"},
    //{"\t     [-dname <dname>] [-validity <valDays>]",
    //    "\t     [-dname <dname>] [-validity <valDays>]"},
    //{"\t     [-keypass <keypass>] [-sigalg <sigalg>]",
    //    "\t     [-keypass <keypass>] [-sigalg <sigalg>]"},
    /** rest is same as -certreq starting from -keystore **/

    {"-storepasswd [-v] [-new <new_storepass>]",
        "-storepasswd [-v] [-new <new_storepass>]"},
    /** rest is same as -certreq starting from -keystore **/

    // policytool
    {"Warning: A public key for alias 'signers[i]' does not exist.  Make sure a KeyStore is properly configured.",
        "Aviso: n\u00e3o existe uma chave p\u00fablica para o alias {0}.  Certifique-se de que um KeyStore esteja configurado adequadamente."},
    {"Warning: Class not found: class", "Aviso: classe n\u00e3o encontrada: {0}"},
    {"Warning: Invalid argument(s) for constructor: arg",
        "Aviso: argumento(s) inv\u00e1lido(s) para o construtor: {0}"},
    {"Illegal Principal Type: type", "Tipo principal ilegal: {0}"},
    {"Illegal option: option", "Op\u00e7\u00e3o ilegal: {0}"},
    {"Usage: policytool [options]", "Uso: policytool [op\u00e7\u00f5es]"},
    {"  [-file <file>]    policy file location",
        "  [-file <file>]    local do arquivo de pol\u00edtica"},
    {"New", "Novo"},
    {"Open", "Abrir"},
    {"Save", "Salvar"},
    {"Save As", "Salvar como"},
    {"View Warning Log", "Visualizar registro de avisos"},
    {"Exit", "Sair"},
    {"Add Policy Entry", "Adicionar entrada de pol\u00edtica"},
    {"Edit Policy Entry", "Editar entrada de pol\u00edtica"},
    {"Remove Policy Entry", "Remover entrada de pol\u00edtica"},
    {"Edit", "Editar"},
        {"Retain", "Conservar"},

        {"Warning: File name may include escaped backslash characters. " +
                        "It is not necessary to escape backslash characters " +
                        "(the tool escapes characters as necessary when writing " +
                        "the policy contents to the persistent store).\n\n" +
                        "Click on Retain to retain the entered name, or click on " +
                        "Edit to edit the name.",
            "Aviso: o nome do arquivo pode incluir caracteres de escape barra invertida. N\u00e3o \u00e9 necess\u00e1rio fazer o escape dos caracteres de barra invertida (a ferramenta faz o escape dos caracteres conforme necess\u00e1rio ao gravar o conte\u00fado da pol\u00edtica no armazenamento persistente).\n\nClique em Conservar para conservar o nome da entrada ou clique em Editar para edit\u00e1-lo."},

        {"Add Public Key Alias", "Adicionar alias de chave p\u00fablica"},
    {"Remove Public Key Alias", "Remover alias de chave p\u00fablica"},
    {"File", "Arquivo"},
    {"KeyStore", "KeyStore"},
    {"Policy File:", "Arquivo de pol\u00edtica:"},
    {"Could not open policy file: policyFile: e.toString()",
        "N\u00e3o foi poss\u00edvel abrir o arquivo de pol\u00edtica: {0}: {1}"},
    {"Policy Tool", "Ferramenta de pol\u00edtica"},
    {"Errors have occurred while opening the policy configuration.  View the Warning Log for more information.",
        "Ocorreram erros ao abrir a configura\u00e7\u00e3o da pol\u00edtica.  Consulte o registro de avisos para obter mais informa\u00e7\u00f5es."},
    {"Error", "Erro"},
    {"OK", "OK"},
    {"Status", "Status"},
    {"Warning", "Aviso"},
    {"Permission:                                                       ",
        "Permiss\u00e3o:                                                       "},
    {"Principal Type:", "Tipo do principal:"},
        {"Principal Name:", "Nome do principal:"},
    {"Target Name:                                                    ",
        "Nome de destino:                                                    "},
    {"Actions:                                                             ",
        "A\u00e7\u00f5es:                                                             "},
    {"OK to overwrite existing file filename?",
        "OK para substituir o arquivo existente {0}?"},
    {"Cancel", "Cancelar"},
    {"CodeBase:", "CodeBase:"},
    {"SignedBy:", "SignedBy:"},
    {"Add Principal", "Adicionar principal"},
    {"Edit Principal", "Editar principal"},
    {"Remove Principal", "Remover principal"},
    {"Principals:", "Principais:"},
    {"  Add Permission", "  Adicionar permiss\u00e3o"},
    {"  Edit Permission", "  Editar permiss\u00e3o"},
    {"Remove Permission", "Remover permiss\u00e3o"},
    {"Done", "Conclu\u00eddo"},
    {"KeyStore URL:", "URL do KeyStore:"},
    {"KeyStore Type:", "Tipo de KeyStore:"},
    {"KeyStore Provider:", "Fornecedor de KeyStore:"},
    {"KeyStore Password URL:", "URL da senha do KeyStore:"},
    {"Principals", "Principais"},
    {"  Edit Principal:", "  Editar principal:"},
    {"  Add New Principal:", "  Adicionar novo principal:"},
    {"Permissions", "Permiss\u00f5es"},
    {"  Edit Permission:", "  Editar permiss\u00e3o:"},
    {"  Add New Permission:", "  Adicionar nova permiss\u00e3o:"},
    {"Signed By:", "Assinado por:"},
    {"Cannot Specify Principal with a Wildcard Class without a Wildcard Name",
        "N\u00e3o \u00e9 poss\u00edvel especificar principal com uma classe de coringa sem um nome de coringa"},
        {"Cannot Specify Principal without a Name",
            "N\u00e3o \u00e9 poss\u00edvel especificar principal sem um nome"},
    {"Permission and Target Name must have a value",
        "O nome de destino e a permiss\u00e3o devem ter um valor"},
    {"Remove this Policy Entry?", "Remover esta entrada de pol\u00edtica?"},
    {"Overwrite File", "Substituir arquivo"},
    {"Policy successfully written to filename",
        "Pol\u00edtica gravada com \u00eaxito em {0}"},
    {"null filename", "nome de arquivo nulo"},
    {"Save changes?", "Salvar altera\u00e7\u00f5es?"},
    {"Yes", "Sim"},
    {"No", "N\u00e3o"},
    {"Policy Entry", "Entrada de pol\u00edtica"},
    {"Save Changes", "Salvar altera\u00e7\u00f5es"},
    {"No Policy Entry selected", "Nenhuma entrada de pol\u00edtica selecionada"},
    {"Unable to open KeyStore: ex.toString()",
        "N\u00e3o \u00e9 poss\u00edvel abrir o KeyStore: {0}"},
    {"No principal selected", "Nenhum principal selecionado"},
    {"No permission selected", "Nenhuma permiss\u00e3o selecionada"},
    {"name", "nome"},
    {"configuration type", "tipo de configura\u00e7\u00e3o"},
    {"environment variable name", "nome da vari\u00e1vel de ambiente"},
    {"library name", "nome da biblioteca"},
    {"package name", "nome do pacote"},
    {"policy type", "tipo de pol\u00edtica"},
    {"property name", "nome da propriedade"},
    {"provider name", "nome do fornecedor"},
        {"Principal List", "Lista de principais"},
        {"Permission List", "Lista de permiss\u00f5es"},
        {"Code Base", "Base de c\u00f3digo"},
        {"KeyStore U R L:", "U R L do KeyStore:"},
        {"KeyStore Password U R L:", "U R L da senha do KeyStore:"},


    // javax.security.auth.PrivateCredentialPermission
    {"invalid null input(s)", "entrada(s) nula(s) inv\u00e1lida(s)"},
    {"actions can only be 'read'", "as a\u00e7\u00f5es podem ser somente 'lidas'"},
    {"permission name [name] syntax invalid: ",
        "sintaxe inv\u00e1lida do nome da permiss\u00e3o [{0}]: "},
    {"Credential Class not followed by a Principal Class and Name",
        "Classe da credencial n\u00e3o seguida por um nome e classe do principal"},
    {"Principal Class not followed by a Principal Name",
        "Classe do principal n\u00e3o seguida por um nome do principal"},
    {"Principal Name must be surrounded by quotes",
        "O nome do principal deve estar entre aspas"},
    {"Principal Name missing end quote",
        "Faltam as aspas finais no nome do principal "},
    {"PrivateCredentialPermission Principal Class can not be a wildcard (*) value if Principal Name is not a wildcard (*) value",
        "A classe do principal PrivateCredentialPermission n\u00e3o pode ser um valor coringa (*) se o nome do principal n\u00e3o for um valor coringa (*)"},
    {"CredOwner:\n\tPrincipal Class = class\n\tPrincipal Name = name",
        "CredOwner:\n\tClasse do principal = {0}\n\tNome do principal = {1}"},

    // javax.security.auth.x500
    {"provided null name", "nome nulo fornecido"},
    {"provided null keyword map", "mapa de palavra-chave nulo fornecido"},
    {"provided null OID map", "mapa OID nulo fornecido"},

    // javax.security.auth.Subject
    {"invalid null AccessControlContext provided",
        "AccessControlContext nulo inv\u00e1lido fornecido"},
    {"invalid null action provided", "a\u00e7\u00e3o nula inv\u00e1lida fornecida"},
    {"invalid null Class provided", "classe nula inv\u00e1lida fornecida"},
    {"Subject:\n", "Subject:\n"},
    {"\tPrincipal: ", "\tPrincipal: "},
    {"\tPublic Credential: ", "\tCredencial p\u00fablica: "},
    {"\tPrivate Credentials inaccessible\n",
        "\tCredenciais privadas inacess\u00edveis\n"},
    {"\tPrivate Credential: ", "\tCredencial privada: "},
    {"\tPrivate Credential inaccessible\n",
        "\tCredencial privada inacess\u00edvel\n"},
    {"Subject is read-only", "O Subject \u00e9 de somente leitura"},
    {"attempting to add an object which is not an instance of java.security.Principal to a Subject's Principal Set",
        "tentativa de adicionar um objeto que n\u00e3o \u00e9 uma inst\u00e2ncia de java.security.Principal a um conjunto de principais do Subject"},
    {"attempting to add an object which is not an instance of class",
        "tentativa de adicionar um objeto que n\u00e3o \u00e9 uma inst\u00e2ncia de {0}"},

    // javax.security.auth.login.AppConfigurationEntry
    {"LoginModuleControlFlag: ", "LoginModuleControlFlag: "},

    // javax.security.auth.login.LoginContext
    {"Invalid null input: name", "Entrada nula inv\u00e1lida: nome"},
    {"No LoginModules configured for name",
     "Nenhum LoginModule configurado para {0}"},
    {"invalid null Subject provided", "Subject nulo inv\u00e1lido fornecido"},
    {"invalid null CallbackHandler provided",
        "CallbackHandler nulo inv\u00e1lido fornecido"},
    {"null subject - logout called before login",
        "Subject nulo - logoff chamado antes do logon"},
    {"unable to instantiate LoginModule, module, because it does not provide a no-argument constructor",
        "n\u00e3o \u00e9 poss\u00edvel instanciar LoginModule, {0}, porque n\u00e3o fornece um construtor sem argumento"},
    {"unable to instantiate LoginModule",
        "n\u00e3o \u00e9 poss\u00edvel instanciar LoginModule"},
    {"unable to instantiate LoginModule: ",
        "n\u00e3o \u00e9 poss\u00edvel instanciar LoginModule: "},
    {"unable to find LoginModule class: ",
        "n\u00e3o \u00e9 poss\u00edvel localizar a classe LoginModule: "},
    {"unable to access LoginModule: ",
        "n\u00e3o \u00e9 poss\u00edvel acessar LoginModule: "},
    {"Login Failure: all modules ignored",
        "Falha de logon: todos os m\u00f3dulos ignorados"},

    // sun.security.provider.PolicyFile

    {"java.security.policy: error parsing policy:\n\tmessage",
        "java.security.policy: erro ao analisar {0}:\n\t{1}"},
    {"java.security.policy: error adding Permission, perm:\n\tmessage",
        "java.security.policy: erro ao adicionar permiss\u00e3o, {0}:\n\t{1}"},
    {"java.security.policy: error adding Entry:\n\tmessage",
        "java.security.policy: erro ao adicionar entrada:\n\t{0}"},
    {"alias name not provided (pe.name)", "nome de alias n\u00e3o fornecido ({0})"},
    {"unable to perform substitution on alias, suffix",
        "n\u00e3o \u00e9 poss\u00edvel realizar a substitui\u00e7\u00e3o no alias, {0}"},
    {"substitution value, prefix, unsupported",
        "valor da substitui\u00e7\u00e3o, {0}, n\u00e3o suportado"},
    {"(", "("},
    {")", ")"},
    {"type can't be null","o tipo n\u00e3o pode ser nulo"},

    // sun.security.provider.PolicyParser
    {"keystorePasswordURL can not be specified without also specifying keystore",
        "keystorePasswordURL n\u00e3o pode ser especificado sem que o armazenamento de chaves tamb\u00e9m seja especificado"},
    {"expected keystore type", "tipo de armazenamento de chaves esperado"},
    {"expected keystore provider", "fornecedor de armazenamento de chaves esperado"},
    {"multiple Codebase expressions",
            "v\u00e1rias express\u00f5es CodeBase"},
        {"multiple SignedBy expressions","v\u00e1rias express\u00f5es SignedBy"},
    {"SignedBy has empty alias","SignedBy possui alias vazio"},
    {"can not specify Principal with a wildcard class without a wildcard name",
        "n\u00e3o \u00e9 poss\u00edvel especificar principal com uma classe de coringa sem um nome de coringa"},
    {"expected codeBase or SignedBy or Principal",
        "CodeBase ou SignedBy ou Principal esperado"},
    {"expected permission entry", "entrada de permiss\u00e3o esperada"},
    {"number ", "n\u00famero "},
    {"expected [expect], read [end of file]",
        "esperado [{0}], lido [fim do arquivo]"},
    {"expected [;], read [end of file]",
        "esperado [;], lido [fim do arquivo]"},
    {"line number: msg", "linha {0}: {1}"},
    {"line number: expected [expect], found [actual]",
        "linha {0}: esperado [{1}], encontrado [{2}]"},
    {"null principalClass or principalName",
        "principalClass ou principalName nulo "},

    // sun.security.pkcs11.SunPKCS11
    {"PKCS11 Token [providerName] Password: ",
        "Senha PKCS11 Token [{0}]: "},

    /* --- DEPRECATED --- */
    // javax.security.auth.Policy
    {"unable to instantiate Subject-based policy",
        "n\u00e3o \u00e9 poss\u00edvel instanciar a pol\u00edtica com base em Subject"}
    };


    /**
     * Returns the contents of this <code>ResourceBundle</code>.
     *
     * <p>
     *
     * @return the contents of this <code>ResourceBundle</code>.
     */
    public Object[][] getContents() {
    return contents;
    }
}
