package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Date App in Java
 * Chapter 2, exercise 2
 */
public class DateApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;
        int lastTwoDigits = 0;

        System.out.println("Please Provide the Number of Day:");
        day = in.nextInt();
        System.out.println("Please Provide the Number of Month");
        month = in.nextInt();
        System.out.println("Please Provide the Number of Year");
        year = in.nextInt();

        lastTwoDigits = year % 100;

        System.out.printf("%02d/%02d/%02d", day, month, lastTwoDigits);
    }
}
