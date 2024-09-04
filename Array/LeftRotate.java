package Array;

public class LeftRotate {
    public static void leftRotateOnePlace(int arr) {

    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void leftRotateDPlace(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = 0; i < n - d; i++) {
            arr[i] = arr[i + d];
        }
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }

    }
    // public static void reverse(int[] arr, int start, int end) {
    // while (start < end) {
    // int temp = arr[start];
    // arr[start] = arr[end - 1];
    // arr[end - 1] = temp;
    // start++;
    // end--;
    // }
    // }

    // public static void leftRotateDPlace(int[] arr, int d) {
    // int n = arr.length;
    // d = d % n;
    // reverse(arr, 0, d); // start ke d
    // reverse(arr, d, n);
    // reverse(arr, 0, n);

    // }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int d = 2;
        leftRotateDPlace(arr, d);
        printArr(arr);
    }
}
