package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Fahrenheit Converter in Java
 * Chapter 2, exercise 1
 */

public class FahrenheitConverter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int degrees = 0;
        int celsius = 0;

        System.out.println("Please Provide Fahrenheit Temperature:");
        degrees = in.nextInt();

        celsius = 5 * (degrees - 32) / 9;

        System.out.printf("The %d Fahrenheit Degrees in Celsius are: %d °C (Celcius Degrees)", degrees, celsius);
    }
}
