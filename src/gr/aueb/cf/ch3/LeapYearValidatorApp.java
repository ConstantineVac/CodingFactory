package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * A class that checks if a given year is a leap year or not
 * and prints a message to the user.
 */
public class LeapYearValidatorApp {

    public static void main(String[] args) {
        // Declaration and Initialization
        Scanner in = new Scanner(System.in);
        int year = 0;

        // Ask user for input
        System.out.println("Please insert a Year (int)");
        year = in.nextInt();

        //check whether year input is leap year or not
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.printf("The year %d is a Leap Year!", year);
        } else {
            System.out.printf("The year %d is not a Leap Year.", year);
        }
    }
}
