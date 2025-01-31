package com.passwordmanager;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.util.Base64;

public class AESEncryption {
    private static final String ALGORITHM = "AES";
    private static final byte[] keyValue = new byte[] { 'r', 'h', 'e', 'B', 'e', 's', 't', 's', 'e', 'c', 'r', 'e', 't', 'k', 'e', 'y' };

    // Méthode pour crypter une chaîne de caractères
    public static String encrypt(String valueToEnc) throws Exception {
        Key key = generateKey();
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedValue = cipher.doFinal(valueToEnc.getBytes());
        return Base64.getEncoder().encodeToString(encryptedValue);
    }

    // Méthode pour décrypter une chaîne de caractères
    public static String decrypt(String encryptedValue) throws Exception {
        Key key = generateKey();
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decodedValue = Base64.getDecoder().decode(encryptedValue);
        byte[] decryptedValue = cipher.doFinal(decodedValue);
        return new String(decryptedValue);
    }

    // Méthode pour générer une clé de cryptage
    private static Key generateKey() throws Exception {
        return new SecretKeySpec(keyValue, ALGORITHM);
    }
}