package gr.aueb.cf.playground;

import java.util.Scanner;

public class SwitchApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        System.out.println("Please make a choice");
        System.out.println("1. 0ne-Player Game");
        System.out.println("2. Two-Player Game");
        System.out.println("3. Team Game");
        System.out.println("4. Exit");
        System.out.println("Choose...");

        choice = in.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Start One-Player Game");
                break;
            case 2:
                System.out.println("Star Two-Player Game");
                break;
            case 3:
                System.out.println("Start Team Game");
                break;
            case 4:
                System.out.println("Exit Game");
                break;
            default:
                System.out.println("Error in Choice");
        }
    }
}
