package gr.aueb.cf.playground;

import java.util.Scanner;

public class BingoWhileApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int key = 10;
        int inputNum = 0;
        boolean bingo = false;

        do {
            System.out.println("Please Guess the Number");
            inputNum = in.nextInt();

            if (inputNum == key) {
                bingo = true;
                System.out.println("Bingo! Great guess, good job!");
            } else {
                System.out.println("Wrong Key! Better Luck next time :(");
                System.out.println("");
            }
        } while (!bingo);
    }
}
