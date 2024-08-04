package Array;

public class KadaneAlgorithm {
    // time complexity 0(n)
    public static int kadanes(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < arr.length; i++) {
            cs = cs + arr[i];
            if (cs < 0) {
                cs = 0;
            }
            maxSum = Math.max(cs, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println("The maximum sum of subArray is : " + kadanes(arr));
    }
}
