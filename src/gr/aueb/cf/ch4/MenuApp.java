package gr.aueb.cf.ch4;

import java.util.Scanner;

public class MenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Choose one of the following");
            System.out.println("1. Add a Product");
            System.out.println("2. Delete a Product");
            System.out.println("3. Exit");
            choice = in.nextInt();
        } while (choice != 3);
    }
}
