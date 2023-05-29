package gr.aueb.cf.playground;

import java.util.Scanner;

/**
 * Asks the user to
 * guess the number
 */
public class BingoApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int key = 10;
        int inputNum = 0;

        System.out.println("Please guess the key number");
        inputNum = in.nextInt();

        if (inputNum == key) {
            System.out.println("Bingo!");
        } else {
            System.out.println("Incorrect Key. Please try again!");
        }
    }
}
