package Array;

import java.util.ArrayList;

public class SubArraySUm {
    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> al = new ArrayList<>();

        // Traverse all subarrays starting from index i
        for (int i = 0; i < n; i++) {
            int sum = 0;

            // Try all subarrays starting from i and ending at j
            for (int j = i; j < n; j++) {
                sum += arr[j];

                // If sum matches the required sum s, store the indices (1-based)
                if (sum == s) {
                    al.add(i + 1);
                    al.add(j + 1);
                    return al;
                }
            }
        }

        // If no such subarray is found, return -1
        al.add(-1);
        return al;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 7, 5 };
        int n = arr.length;
        int s = 12;

        ArrayList<Integer> result = subarraySum(arr, n, s);
        System.out.println(result); // Output should be [2, 4]
    }
}
