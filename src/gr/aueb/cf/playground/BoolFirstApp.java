package gr.aueb.cf.playground;

import java.util.Scanner;

/**
 * Decides if it's snowing
 * based on the temperature readings
 * if temp < 0, then it's snowing, else not.
 */
public class BoolFirstApp {

    public static void main(String[] args) {
        //Declaration
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        int temp = 0;

        //Commands
        System.out.println("Please insert int temperature");
        temp = in.nextInt();

        isSnowing = (temp < 0);

        System.out.printf("The given temperature is %d. Based on that the isSnowing value is %b", temp, isSnowing);
    }
}
