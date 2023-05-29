package gr.aueb.cf.playground;

import java.util.Scanner;

/**
 * The program accepts a string input from the user
 * Then it passes the string to encryptor function
 * which with the help of StringBuilder method
 * encrypts the characters of the string with their
 * next.
 */
public class StringEncryptionApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;
        String encrypted;

        System.out.println("Please enter your message for encryption!");
        input = in.nextLine();

        encrypted = encryptor(input);
        System.out.println("Encrypted String: " + encrypted);
    }

    /**
     * Accepts a string and creates a new string by replacing each
     * character with their ASCII+1 character.
     * @param input a String from user input
     * @return a decrypted String
     */
    public static String encryptor(String input) {
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            c = (char) (c + 1);
            encrypted.append(c);
        }
        return encrypted.toString();
    }
}
