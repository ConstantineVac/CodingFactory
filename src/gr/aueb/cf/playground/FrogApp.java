package gr.aueb.cf.playground;

import java.util.Scanner;

/**
 * small frog tries to cross a river
 * frog is located at position X
 * and aims to reach position Y
 * or position greater than Y (>=Y)
 *Frog jumps a fixed distance
 *
 * the app finds the min number of jumps
 * required in order to reach Y or further
 *
 * Example
 * X = 10, Y = 85, d = 30.
 * Frog will need 3 jumps
 */
public class FrogApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int jump = 0;
        int count = 0;
        int position = 0;

        System.out.println("Enter frogs position, target position, jump distance (ints)");
        x = in.nextInt();
        y = in.nextInt();
        jump = in.nextInt();

        position = x;
        while ( position < y) {
            position = position + jump;
            count++;
        }

        System.out.printf("Frog started at position X = %d and managed to reach position %d with jump = %d in %d jumps", x, position, jump, count);
    }
}
