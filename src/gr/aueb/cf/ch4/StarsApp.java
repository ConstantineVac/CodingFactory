package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Prints horizontally n *
 */
public class StarsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int i = 0;
        int numberOfStars = 0;

        System.out.println("Please insert number of * (int)");
        numberOfStars = in.nextInt();
        System.out.println("Printing: " + numberOfStars +" Stars...");

        while (i <=numberOfStars){
            System.out.print("*");
            i++;
            if (i % 50 == 0){
                System.out.println();
            }
        }
    }
}
