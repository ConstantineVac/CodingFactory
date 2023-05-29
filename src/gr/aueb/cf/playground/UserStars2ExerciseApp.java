package gr.aueb.cf.playground;

import java.util.Scanner;

/**
 * This app accepts n stars from
 * user input and prints n stars
 * vertically.
 */
public class UserStars2ExerciseApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int stars = 0;

        System.out.println("Please enter an int number for the stars:");
        stars = in.nextInt();
        for (int i = 1; i <= stars; i++){
            System.out.println("*");
        }
    }
}
