package gr.aueb.cf.ch5;

/**
 * Adds 2 ints with
 * the usage of add
 * method.
 */
public class AddApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = 0;

        sum = AddApp.add(a, b);

        System.out.println(sum);
    }

    public static int add(int a, int b) {
//        int sum = 0;
//        sum = a + b;
        return a + b;
    }
}
