package gr.aueb.cf.ch6.floats;

import java.util.Scanner;

public class TriangleApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final double EPSILON = 0.000005;
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        boolean isRight = false;

        System.out.println("Please insert the a, b, c sides of a triangle:");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        isRight = (Math.abs(a*a - b*b - c*c) <= EPSILON);

        System.out.printf("The triangle is right: %b", isRight);
    }
}
