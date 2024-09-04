package Array;

public class Largest {
    public static int largest(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int recurLargest(int arr[], int max, int i) {
        if (i == arr.length) {
            return max;
        }
        if (max < arr[i]) {
            max = arr[i];
        }
        return recurLargest(arr, max, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { -1, 3, 67, 56, 89, 123, 14, 45, 12, 79, 170 };
        int max = Integer.MIN_VALUE;
        // System.out.println(largest(arr));
        System.out.println(recurLargest(arr, max, 0));

    }
}
