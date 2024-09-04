package Array;

public class RightRotate {

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end - 1];
            arr[end - 1] = temp;
            start++;
            end--;
        }
    }

    public static void rightRotateDPlace(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        int temp[] = new int[d];
        // copy last d elment
        for (int i = 0; i < d; i++) {
            temp[i] = arr[(n - d) + i];
        }
        // index find kro jha arr end hai phir reversely exchange
        for (int i = n - d - 1; i >= 0; i--) {
            arr[i + d] = arr[i];
        }

        for (int i = 0; i < d; i++) {
            arr[i] = temp[i];
        }

    }

    // public static void rightRotateDPlace(int[] arr, int d) {
    // int n = arr.length;
    // d = d % n;
    // reverse(arr, n - d, n); // last ke d element
    // reverse(arr, 0, n - d);
    // reverse(arr, 0, n);
    // }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int d = 2;
        rightRotateDPlace(arr, d);
        printArr(arr);
    }
}
