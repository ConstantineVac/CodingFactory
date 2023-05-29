package gr.aueb.cf.cha6;

/**
 * Declare, initiate array
 * and populate it.
 */
public class PopulateArray {

    public static void main(String[] args) {

        //Declare and initiate array of length 3x3
        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 7;
        arr[2] = 8;

        // System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //enhanced for
        for (int item : arr) {
            System.out.print(item + " ");
        }

        //Un-sized initialization
        int[] arr2 = {1, 5, 8, 9, 12};

        //array initializer
        int[] arr3 = new int[] {4, 6, 9, 10};
    }
}
