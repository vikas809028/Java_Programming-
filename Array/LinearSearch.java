package Array;

public class LinearSearch {
    public static int linearSearch(int[] arr, int key) {
        // time complexity 0(n)
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 7, 2, 11, 9, 5 };
        int index = linearSearch(arr, 12);
        if (index != -1) {
            System.out.println("The key is found at " + index);
        } else {
            System.out.println("Key not found");
        }
    }
}
