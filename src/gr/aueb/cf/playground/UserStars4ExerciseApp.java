package gr.aueb.cf.playground;

import java.util.Scanner;

/**
 * This app accepts n stars from
 * user input and prints n stars
 * horizontally n rows
 * and vertically 1 : n
 * stars in each row
 */
public class UserStars4ExerciseApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int stars = 0;

        System.out.println("Please enter an int number for the stars:");
        stars = in.nextInt();
        for (int i = 1; i <= stars; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
