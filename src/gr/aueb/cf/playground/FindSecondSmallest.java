package gr.aueb.cf.playground;

/**
 *         The app scans an int array of values and finds the second-smallest
 *         int by calling the method findSecondSmallest.
 */
public class FindSecondSmallest {

    public static void main(String[] args) {
        int[] array = { 10, 20, 5, 35, 40, 15 };

        int secondSmallest = findSecondSmallest(array);
        System.out.println("The second smallest element in the array is: " + secondSmallest);
    }

    /**
     *        Receives an int Array of values
     *        Then initializes the 1st int as the smallest
     *        Inside the for the ints of the array are being iterated
     *        If the int is lesser than the smallest, it becomes the smallest
     *        If the int is lesser than the secondSmallest and not equal to smallest
     *        The i int of Array now becomes the secondSmallest.
     *        Method Returns the secondSmallest
     *
     * @param array     array of integer values
     * @return          returns a single int value the secondSmallest
     */
    public static int findSecondSmallest(int[] array) {
        int smallest = array[0];
        int secondSmallest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                secondSmallest = smallest;
                smallest = array[i];
            } else if (array[i] < secondSmallest && array[i] != smallest) {
                secondSmallest = array[i];
            }
        }

        return secondSmallest;
    }

}
