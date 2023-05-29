package gr.aueb.cf.playground;

import java.util.Scanner;

/**
 * This app accepts an encrypted message using
 * the output of StringEncryptionApp and decrypts it
 * with the help of the decryptor method.
 */
public class StringDecryptionApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String encrypted;
        String decrypted;

        System.out.println("Please paste the encrypted message for decryption:");
        encrypted = in.nextLine();

        decrypted = decryptor(encrypted);
        System.out.println("Decrypted String: " + decrypted);
    }

    /**
     * Accepts an encrypted message from user input
     * and then decrypts it.
     * @param encrypted an encrypted string from user input
     * @return returns a decrypted String
     */
    public static String decryptor(String encrypted) {
        StringBuilder decrypted = new StringBuilder();
        for (int i = 0; i < encrypted.length(); i++) {
            char c = encrypted.charAt(i);
            c = (char) (c - 1);
            decrypted.append(c);
        }
        return decrypted.toString();
    }
}

