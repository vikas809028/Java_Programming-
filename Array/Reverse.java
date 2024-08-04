package Array;

public class Reverse {
    public static void print(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    public static void main(String[] args) {

        int arr[] = { 23, 45, 65, 25, 48, 56 };
        System.out.print("Before reversing an Array : ");
        print(arr);
        reverseArray(arr);
        System.out.println();
        System.out.print("After reversing an array : ");
        print(arr);

    }
}
