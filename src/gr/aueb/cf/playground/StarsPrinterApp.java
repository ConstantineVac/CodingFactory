package gr.aueb.cf.playground;

import java.util.Scanner;

/**
 * An application that prints a choice menu to the user
 * then reads the desired number of stars from the user.
 * The app offers 5 options/methods to print stars.
 * The user makes a choice from 1-5 or 6 to exit
 * and then declares how many stars the app will print.
 */
public class StarsPrinterApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int stars = 0;
        int choice = 0;


        printMenu();
        choice = in.nextInt();
        if (choice >= 1 && choice <=5) {
            System.out.println("How many stars?");
            stars = in.nextInt();
        }

        switch (choice) {
            case 1:
                printStarsHor(stars);
                break;
            case 2:
                printStarsVer(stars);
                break;
            case 3:
                printStarsHorVer(stars);
                break;
            case 4:
                printStarsHorVerAsc(stars);
                break;
            case 5:
                printStarsHorVerDesc(stars);
                break;
            case 6:
                break;
            default:
                System.out.println("Wrong Choice! Try again.");
        }
    }

    /**
     * Prints a menu for
     * the user to choose
     * an option to print
     * stars
     */
    public static void printMenu() {
            System.out.println("Welcome to Stars Printer Menu !");
            System.out.println();
            System.out.println();
            System.out.println("1. Print n Stars Horizontally");
            System.out.println("2. Print n Stars Vertically");
            System.out.println("3. Print n Rows with n Stars");
            System.out.println("4. Print n Rows with 1 - n Stars");
            System.out.println("5. Print n Rows with n - 1 Stars");
            System.out.println("6. Exit");
            System.out.println();
            System.out.println("Make your choice: ");
        }

    /**
     * Accepts the number of stars
     * and prints n stars horizontally
     * @param stars number of stars from user input
     */
    public static void printStarsHor(int stars) {
            for (int i = 1; i <= stars; i++) {
                System.out.print("*");
            }
        }

    /**
     * Accepts the number of stars
     * and prints n stars vertically
     * @param stars number of stars from user input
     */
    public static void printStarsVer(int stars) {
        for (int i = 1; i <= stars; i++) {
            System.out.println("*");
        }
    }

    /**
     * Accepts the number of stars
     * and prints n rows of n stars
     * @param stars number of stars from user input
     */
    public static void printStarsHorVer(int stars) {
        for (int i = 1; i <= stars; i++) {
            printStarsHor(stars);
            System.out.println();
        }
    }

    /**
     * Accepts the number of stars
     * and prints n rows of 1 to n (ascending) stars
     * @param stars number of stars from user input
     */
    public static void printStarsHorVerAsc(int stars) {
        for (int i = 1; i <= stars; i++) {
            printStarsHor(i);
            System.out.println();
        }
    }

    /**
     * Accepts the number of stars
     * and prints n rows of n to 1 (descending) stars
     * @param stars number of stars from user input
     */
    public static void printStarsHorVerDesc(int stars) {
        for (int i = stars; i >= 0; i--) {
            printStarsHor(i);
            System.out.println();
        }
    }
}
