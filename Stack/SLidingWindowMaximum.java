package Stack;

import java.util.ArrayList;

public class SLidingWindowMaximum {
    public static ArrayList<Integer> svm(int arr[], int k) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length - k + 1; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < i + k; j++) {
                max = Math.max(arr[j], max);
            }
            al.add(max);
        }
        return al;

    }

    public static void main(String[] args) {
        int arr[] = { 4, 0, -1, 3, 5, -2, 8 };
        ArrayList<Integer> ans = svm(arr, 4);
        System.out.println(ans);
    }
}
