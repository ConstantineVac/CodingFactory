package gr.aueb.cf.ch5;

public class FactorialRecursiveApp {

    public static void main(String[] args) {

    }

    public static int facto(int n) {
        if (n <= 1) return 1;
        return n * facto(n-1);
    }
}
