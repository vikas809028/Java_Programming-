package Array;

public class SecondMin {
    public static int secondMin(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            System.out.println("No second element Exist");
        }
        int min = arr[0];
        int secMin = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                secMin = min;
                min = arr[i];

            }
            if (arr[i] < min && arr[i] < secMin) {
                secMin = arr[i];
            }
        }
        return secMin;
    }

    public static void main(String[] args) {
        int arr[] = { 15, 12, 11, 32, 16, 23, 12, -1, -2, 45 };

        System.out.println(secondMin(arr));

    }
}
