package gr.aueb.cf.playground;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *  The Menu App is an app that prints a Menu with 5 options.
 *  It accepts an integer from user input between 1 - 5.
 *  It also makes all the necessary validations to ensure that
 *  the variable choice is an integer. If it's indeed an int,
 *  It checks whether that int falls between 1 and 5.
 *  In both cases, it prints a relevant message to the user and loops back
 *  to choice until it receives a valid choice integer.
 */
public class MenuApp {

    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int choice = 0;
        boolean isValidChoice = false;

        printMenu();
        System.out.println();

        while (!isValidChoice) {
            System.out.println("Please enter your choice (int):");
            try {
                choice = getChoice(in);
                isValidChoice = true;

                try {
                    printChoice(choice);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    System.out.println();
                    isValidChoice = false; // Prompt the user again for a valid choice
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid choice. Please try again.");
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                System.out.println();
                in.next(); // Clears the invalid input from the scanner
            }
        }

        System.out.println("Thanks for using the Application !");
    }

    /**
     * Returns a menu with the available choices
     * for the user to choose from.
     */
    public static void printMenu(){
        System.out.println("Welcome to MenuApp !");
        System.out.println();
        System.out.println("Choose one of the following:");
        System.out.println();
        System.out.println("1. Add Integers");
        System.out.println("2. Subtract Integers");
        System.out.println("3. Multiply Integers");
        System.out.println("4. Divide Integers");
        System.out.println("5. Exit");
    }

    /**
     * This method is responsible for checking
     * whether the user input is indeed a parsable integer
     * otherwise, it prints a user-friendly message.
     * @param in Scanner variable
     * @return returns an error if integer input is not
     * an integer number
     */
    public static int getChoice(Scanner in) {
        try {
            int choice = in.nextInt();
            in.nextLine(); // Clear the newline character from the scanner
            return choice;
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Invalid input. Please enter an integer.");
        }
    }

    /**
     * This method is responsible for checking whether
     * the integer given from the user is indeed between
     * the range of available choices. If that is true
     * it prints the choice, otherwise it throws an error
     * and prints a user-friendly message.
     * @param choice integer number generated from user input
     */
    public static void printChoice(int choice) {
        if (choice >= 1 && choice <= 5) {
            System.out.printf("Your choice is: %d%n", choice);
        } else {
            System.out.println("Invalid choice. Please try again.");
            throw new IllegalArgumentException("Choice is out of range!");
        }
    }
}
