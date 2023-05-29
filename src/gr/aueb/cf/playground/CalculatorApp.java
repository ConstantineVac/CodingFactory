package gr.aueb.cf.playground;

import java.util.Scanner;

/**
 * reads from the user a number(int)
 * a symbol of math and one more int
 * executes the calculation depending
 * the symbol of input. +, -, *, /, %.
 */
public class CalculatorApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;
        char operator = ' ';
        boolean isError = false;

        System.out.println("Please insert an int, an operator and a second int");
        num1 = sc.nextInt();
        operator = sc.next().charAt(0);
        num2 = sc.nextInt();

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                }
                break;
            case '%':
                if (num2 != 0) {
                    result = num1 % num2;
                }
                break;
            default:
                System.out.println("Error in operator");
                isError = true;
                break;

        }
        if (!isError) {
            System.out.printf("%d %c %d = %d", num1, operator, num2, result);
        }
    }
}
