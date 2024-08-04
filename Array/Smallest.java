package Array;

public class Smallest {

    public static int smallest(int[] arr) {
        int smallest = Integer.MAX_VALUE; // +infinity
        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int arr[] = { 546, 13, 67, 56, 89, 123, 124, 45, 12, 79, 345, 11 };
        System.out.println(smallest(arr));

    }
}