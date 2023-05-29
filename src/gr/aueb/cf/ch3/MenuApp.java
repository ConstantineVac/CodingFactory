package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * The program prints a
 * five option/choice menu
 * and asks the user to
 * make a choice between 1 and 5
 * it also checks whether this
 * choice is between available limits 1-5
 * and prints a message to the user if not
 */
public class MenuApp {

    public static void main(String[] args) {
        //Declaration and Initialization
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Choose one of the following:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Update");
            System.out.println("4. Search");
            System.out.println("5. Exit");

            //Ask user for input and check input
            choice = in.nextInt();
            if (choice < 1 || choice > 5) {
                System.out.println("Please insert a number (1-5)\n");
            }
        } while (choice != 5);
    }
}
