package gr.aueb.cf.ch4;

import java.util.Scanner;

public class PositiveCountApp {

    public static void main(String[] args) {
        //Declaring vars
        Scanner in = new Scanner(System.in);
        int num = 0;
        int positiveCount = 0;

        System.out.println("Please give a num (int)");
        num = in.nextInt();

        while (num >= 0) {
            positiveCount++;
            System.out.println("Please give a num (int)");
            num = in.nextInt();
        }

        System.out.printf("Positive-count: " + positiveCount);
    }
}
