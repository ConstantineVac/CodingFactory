package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Takes a number from
 * user and calculates
 * the factorial of that
 * number.
 */
public class FactorialApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        long fact = 1L;
        int i = 1;

        System.out.println("Insert an integer");
        num = in.nextInt();


        while (i <= num) {
            fact = fact * i;
            i += 1;
            System.out.println(fact);
        }

        System.out.println("Factorial of " + num + " is " + fact);
    }
}
