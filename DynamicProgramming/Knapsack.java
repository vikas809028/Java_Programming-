package DynamicProgramming;

public class Knapsack {

    public static int knapSackRecursive(int[] val, int[] wt, int W, int n) {
        // bag capacity is full or it is initialy zero
        if (W == 0 || n == 0) {
            return 0;
        }
        if (wt[n - 1] <= W) {
            // include
            int ans1 = knapSackRecursive(val, wt, (W - wt[n - 1]), n - 1) + val[n - 1];
            // exclude
            int ans2 = knapSackRecursive(val, wt, W, n - 1);
            return Math.max(ans1, ans2);
        } else {
            return knapSackRecursive(val, wt, W, n - 1);
        }
    }

    public static int knapSackMemoization(int[] val, int[] wt, int W, int n) {
        int dp[][] = new int[n + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        // bag capacity is full or it is initialy zero
        if (W == 0 || n == 0) {
            return 0;
        }
        // TO remove repetitions and check whether value is already calculated or not
        if (dp[n][W] != -1) {
            return dp[n][W];
        }

        if (wt[n - 1] <= W) {
            // include
            int ans1 = knapSackMemoization(val, wt, (W - wt[n - 1]), n - 1) + val[n - 1];
            // exclude
            int ans2 = knapSackMemoization(val, wt, W, n - 1);
            dp[n][W] = Math.max(ans1, ans2);
            return dp[n][W];
        } else {
            dp[n][W] = knapSackMemoization(val, wt, W, n - 1);
            return dp[n][W];
        }
    }

    public static int knapsackTab(int[] val, int[] wt, int W, int n) {
        int dp[][] = new int[n + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                int v = val[i - 1];
                int w = wt[i - 1];
                if (w <= j) {
                    int incProfit = v + dp[i - 1][j - w];
                    int excProfit = dp[i - 1][j];
                    dp[i][j] = Math.max(incProfit, excProfit);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][W];
    }

    public static void main(String[] args) {
        int arr[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int n = arr.length;
        int W = 7;
        int profit1 = knapSackRecursive(arr, wt, W, n);
        int profit2 = knapSackMemoization(arr, wt, W, n);
        int profit3 = knapsackTab(arr, wt, W, n);
        System.out.println("Maximun profit : " + profit1);
        System.out.println("Maximun profit : " + profit2);
        System.out.println("Maximun profit : " + profit3);
    }
}
