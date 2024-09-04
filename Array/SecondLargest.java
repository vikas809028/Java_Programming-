package Array;

public class SecondLargest {
    public static int secondLargest(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            System.out.println("No second element Exist");
        }
        int largest = arr[0];
        int secLargest = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                secLargest = largest;
                largest = arr[i];

            }
            if (arr[i] < largest && arr[i] > secLargest) {
                secLargest = arr[i];
            }
        }
        return secLargest;
    }

    public static void main(String[] args) {
        int arr[] = { 15, 12, 32, 16, 23, 12, 45 };

        System.out.println(secondLargest(arr));

    }
}
