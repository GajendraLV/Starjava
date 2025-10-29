package com.Technical.internal;


import java.security.MessageDigest;

import static com.Technical.external.encrypt.encrypt;

public class Encryption {
    public static void main(String[] args) {
        String password = "Gajendra@123"; // your password

        String encrypted = encrypt(password); // call method

        System.out.println("Original Password: " + password);
        System.out.println("Encrypted Password: " + encrypted);
    }
}