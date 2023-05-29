package gr.aueb.cf.playground;

import java.math.BigInteger;
import java.util.Scanner;

public class ForBigIntApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ZERO;
        BigInteger result = BigInteger.ONE;

        System.out.println("Please Insert 2 integers");
        a = BigInteger.valueOf(in.nextInt());
        b = BigInteger.valueOf(in.nextInt());

        for (int i = 1; i <= b.intValue(); i++) {
            result = result.multiply(a);
        }

        System.out.printf("%d^%d = %d", a, b, result);
    }
}
