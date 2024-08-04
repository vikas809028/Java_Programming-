package Array;

public class BinarySearch {

    public static int BinarySearchAlgo(int arr[], int key) {
        int start = 0;
        int mid;
        int end = arr.length - 1;
        while (start <= end) {
            mid = start - (start - end) / 2;
            // mid=start+(end-start)/2;
            if (arr[mid] == key) {
                return mid;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 12, 43, 67 };
        System.out.println();
        int idx = BinarySearchAlgo(arr, 12);
        System.out.println(idx);
        if (idx != -1) {
            System.out.println("key is found at index " + idx);
        } else {
            System.out.println("key is not found");
        }

    }
}
