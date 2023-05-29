package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Accepts start, end and step
 * and prints accordingly stars
 */
public class StarsStepApp {

    public static void main(String[] args) {
        //Declaration
        Scanner in = new Scanner(System.in);
        int start = 0;
        int end = 0;
        int step = 0;
        int i = 0;

        System.out.println("Please Start, End value and step (int)");
        start = in.nextInt();
        end = in.nextInt();
        step = in.nextInt();

        i = start;
        while (i <= end){
            System.out.print("*");
            i = i + step;
        }
    }
}
