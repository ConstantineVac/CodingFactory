package gr.aueb.cf.playground;

import java.util.Scanner;

/**
 * Decides if the car lights should turn on,
 * based on 3 variables. If it's raining and
 * simultaneously if it's true one of the following,
 * isDark = true or velocity > 100 kph. These values are
 * given by the user using the keyboard.
 */
public class LightsApp {

    public static void main(String[] args) {
        //Declaration
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int velocity = 0;
        boolean lightsOn = false;

        //Commands
        System.out.println("Please insert whether it's raining or not (true / false)");
        isRaining = in.nextBoolean();

        System.out.println("Please insert whether it's dark or not (true / false)");
        isDark = in.nextBoolean();

        System.out.println("Enter current vehicle velocity(int)");
        velocity = in.nextInt();

        isRunning = (velocity > 100);
        lightsOn = isRaining && (isDark || isRunning);


        //Print Results
        System.out.printf("Conditions status. Rain = %b, Dark = %b, and current speed in KPH = %d. So lightsOn = %b", isRaining, isDark, velocity, lightsOn);
    }
}
