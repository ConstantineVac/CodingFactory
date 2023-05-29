package gr.aueb.cf.playground;

public class FindMaxPosApp {

    public static void main(String[] args) {
        int [] array = {1,4,5,83,35,167,12,9,11};
        int maxPosition = 0;

        maxPosition = getMaxPosition(array, 0, array.length - 1);
        System.out.printf("The position of Max number %d is %d!", array[maxPosition], maxPosition+1);
    }

    public static int getMaxPosition(int[] arr, int low, int high) {
        int maxPosition = low;

        for (int i = low + 1; i <= high; i++) {
            if (arr[i] > arr[maxPosition]) {
                maxPosition = i;
            }
        }

        return maxPosition;
    }

}
