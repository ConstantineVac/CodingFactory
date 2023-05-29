package gr.aueb.cf.playground;

import java.util.Scanner;

public class TriangleApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a;
        double b;
        double c;
        final double EPSILON = 0.000005;
        boolean isRight = false;

        System.out.println("Please enter a, b and c: ");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        if (Math.abs(a*a - (b*b + c*c)) <= EPSILON) {
            System.out.println("The triangle is right");
        }else {
            System.out.println("The triangle is not right");
        }
    }
}
