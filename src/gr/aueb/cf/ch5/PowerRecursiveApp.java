package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * calculates a^n recursively.
 */
public class PowerRecursiveApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a = 0;
        float b = 0;

        System.out.println("Please enter 2 numbers, 1st for Base, 2nd for power");
        a = in.nextInt();
        b = in.nextInt();

        System.out.println();
    }

    /**
     * Recursive a^n.
     * @param a     the base.
     * @param b     the power.
     * @return      the power of a
     */
    public static float power(float a, float b) {
        float result = 0;

        if (b == 0) {
            result = 1;
        } else if (b < 0) {
            result = 1 / power(a, -b);
        } else {
            result = a * power(a, b-1);
        }

        return result;
    }
}

