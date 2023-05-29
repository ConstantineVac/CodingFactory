package gr.aueb.cf.playground;

import java.util.Scanner;

/**
 * Decides if it's snowing
 * based not only on temperature readings
 * but also on the fact that it's raining or not
 * If it's raining and the temp is < 0, then it snows
 * else not.
 */
public class BoolApp2 {

    public static void main(String[] args) {
        //Declaration
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isSnowing = false;
        int temp = 0;

        //Commands and Calculations
        System.out.println("Please insert if it's raining right now");
        isRaining = in.nextBoolean();

        System.out.println("Please insert a temperature value(int)");
        temp = in.nextInt();

        isSnowing = isRaining && (temp < 0);

        //Print Results
        System.out.printf("The given temperature is %d° and raining is %b then the isSnowing is %b", temp, isRaining, isSnowing);
    }
}
