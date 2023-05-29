package gr.aueb.cf.ch5;

import java.util.Scanner;

public class PowerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int result = 0;

        System.out.println("Please insert 2 ints a, b: ");
        a = in.nextInt();
        b = in.nextInt();

        result = PowerApp.pow(a, b);

        System.out.printf("The %d ^ %d = %d", a, b, result);

    }

    /**
     *
     * @param a the base
     * @param n the power
     * @return the power of a ^ n
     */
    public static int pow(int a, int n) {
        int power = 1;
        for (int i = 1; i < n; i++) {
            power *= a;
        }
        return power;
    }
}
