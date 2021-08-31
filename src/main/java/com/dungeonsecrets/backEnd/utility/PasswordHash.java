package com.dungeonsecrets.backEnd.utility;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordHash {

    public static String passwordHash(String password) {
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        messageDigest.reset();
        byte[] hash = messageDigest.digest(password.getBytes());
        return bytesToStringHex(hash);

    }

    public static String bytesToStringHex(byte[] bytes){
        char[] hexArray         = "0123456789abcdef".toCharArray();
        char[] hexChars         = new char[bytes.length * 2];
        for (int i = 0; i < bytes.length; i++) {
            int v               = bytes[i] & 0xFF;
            hexChars[i * 2]     = hexArray[v >>> 4];
            hexChars[i * 2 + 1] = hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }
}
