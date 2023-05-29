package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Creates a simple calculator
 * which offers the functions
 * pf add, sub, mul, dic, mod.
 * Prints a menu to the user
 * with options and accepts
 * a value of choice
 * next asks the user for
 * 2 num1 num2 values
 * and prints the result
 */
public class CalculatorApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int choice = 0;
        int result = 0;

        do {
            printMenu();
            choice = getNextInt("Please insert your choice");

            //validation
            if (isChoiceInvalid(choice)){
                System.out.println("Choice Invalid");
            }
            if (isChoiceQuit(choice)) {
                break;
            }

            result = onChoiceGetResult(choice);
            System.out.println(result);
        } while (true);
    }

    public static void printMenu(){
        System.out.println("Choose one of the following:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Module");
        System.out.println("6. Quit");
    }

//    public static scanner in.nextInt()
    public static int getNextInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextInt();
    }

    public static boolean isChoiceInvalid (int choice) {
        return choice < 1 || choice > 6;
    }

    public static boolean isChoiceQuit(int choice) {
        return choice == 6;
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int sub(int num1, int num2) {
        return num1 - num2;
    }

    public static int mul(int num1, int num2) {
        return num1 * num2;
    }

    public static int div(int num1, int num2) {
        int value = 0;
        if (num2 == 0){
            return Integer.MAX_VALUE;
        } else {
            value = num1 / num2;
        }
        return value;
    }

    public static int mod(int num1, int num2) {
        if (num2 == 0){
            return Integer.MAX_VALUE;
        }
        return num1 % num2;
    }

    public static int onChoiceGetResult(int choice) {

        int num1 = getNextInt("Please insert the 1st number (int)");
        int num2 = getNextInt("Please insert the 2nd number (int)");
        int result = 0;

        switch (choice) {
            case 1:
                result =  add(num1, num2);
                break;
            case 2:
                result = sub(num1, num2);
                break;
            case 3:
                result =  mul(num1, num2);
                break;
            case 4:
                result = div(num1, num2);
                break;
            case 5:
                result =  mod(num1, num2);
                break;
            case 6:
            default:
                break;

        }

        return result;
    }
}

