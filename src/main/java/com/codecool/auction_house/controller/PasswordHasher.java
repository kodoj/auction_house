package com.codecool.auction_house.controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class PasswordHasher {

    public static String hashPassword(String password) {
        String hashedPassword = null;
        try {
            byte[] salt = getSalt();
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(salt);
            byte[] passwordBytes = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for(int i=0; i< passwordBytes.length ;i++)
            {
                sb.append(Integer.toString((passwordBytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            hashedPassword = sb.toString();
        }
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return hashedPassword;
    }

    private static byte[] getSalt() throws NoSuchAlgorithmException
    {
        SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
        byte[] salt = new byte[16];
        sr.nextBytes(salt);
        return salt;
    }
}
