package gr.aueb.cf.playground;

/**
 * an app that prints gradually
 * +1 more stars for 10 rows
 * the 10th row shall have 10 stars
 */
public class AscendingStarsRowsApp {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
