package Array;

public class Largest {

    public static int latgest(int[] arr) {
        int largest = Integer.MIN_VALUE; // -infinity
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = { 546, 3, 67, 56, 89, 123, 124, 45, 12, 79, 345 };
        System.out.println(latgest(arr));

    }
}
