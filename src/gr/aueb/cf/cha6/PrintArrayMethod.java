package gr.aueb.cf.cha6;

public class PrintArrayMethod {

    public static void main(String[] args) {
        int[] grades = {1, 2, 3, 4};
        printArray(grades);
    }

    public static void printArray(int[] arr) {
        for  (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
