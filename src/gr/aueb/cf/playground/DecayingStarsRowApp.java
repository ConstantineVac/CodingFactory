package gr.aueb.cf.playground;

/**
 * app that prints 10 stars
 * to the 1st row and ends up
 * printing 1 star at row n.10
 */
public class DecayingStarsRowApp {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

