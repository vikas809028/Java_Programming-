package Array;

public class MaxSubArraySum {
    public static int maxSubArraySumBruteForce(int arr[]) {
        // time complexity 0(n3)
        int tl = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum = currSum + arr[k];
                }
                System.out.print(currSum + " ");
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
                tl = tl + 1;
            }
        }
        System.out.println();
        System.out.println("Total numbers of pairs " + tl);
        return maxSum;

    }

    // time complexity 0(n2)
    public static int maxSubArrayPrefixSum(int arr[]) {
        // calculate prefix sum
        int prefixSum[] = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        int tl = 0; // for total number if subarray
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                // getting current sum in linear time using prefix sum
                // for i = 0 prefix i-1 will be negative hence use condition
                int currSum = i == 0 ? prefixSum[i] : prefixSum[j] - prefixSum[i - 1];

                if (currSum > maxSum) {
                    maxSum = currSum;
                }

                tl = tl + 1;
            }
        }
        System.out.println();
        System.out.println("Total numbers of pairs " + tl);
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        // int maxSum = maxSubArraySumBruteForce(arr);
        int maxSum = maxSubArrayPrefixSum(arr);
        System.out.println("The maximun sum of sunArray is " + maxSum);

    }

}
