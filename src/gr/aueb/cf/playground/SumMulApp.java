package gr.aueb.cf.playground;

public class SumMulApp {

    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;

        for (int i = 1; i <= 10; i++) {
            sum += i;
            //System.out.println("Sum is: " + sum);
            mul *= i;
            //System.out.println("Mul is: " + mul);
        }

        System.out.println("Sum is: " + sum);
        System.out.println("Mul is: " + mul);
    }
}
