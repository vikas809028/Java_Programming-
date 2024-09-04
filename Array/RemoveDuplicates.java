package Array;

public class RemoveDuplicates {
    // two pointer approach
    public static int remDup(int arr[]) {
        if (arr.length == 0)
            return 0;
        int n = arr.length;
        int j = 0;
        // chalte jao chalte jao aur agar not equal mile j++ krke value assign kr do
        for (int i = 1; i < n; i++) {
            // most optimized solution
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        for (int k = 0; k <= j; k++) {
            System.out.print(arr[k] + " ");
        }
        return j + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2, 2, 3, 3, 4, 5, 5, 6, 7, 8, 9, };
        int k = remDup(arr);
        System.out.println();
        System.out.println("After removing duplicates, the length of the array is: " + k);
    }
}
