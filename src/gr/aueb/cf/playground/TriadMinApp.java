package gr.aueb.cf.playground;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TriadMinApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min = 0;

        System.out.println("Please enter to integers");
        num1 = in.nextInt();
        num2 = in.nextInt();

        min = (num1 < num2) ? num1 : num2;
        System.out.printf("The min value between %d and %d is %d\n", num1, num2, min);
    }
}
