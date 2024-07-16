package DynamicProgramming;

public class ClimbingStairs {

    public int ClimbingStairsways(int n, int[] dp) {
        if (n == 0 || n == 1) {
            return dp[n] = 1;
        }
        if (n < 0) {
            System.out.println("we can not climp as their are no stairs");
            return 0;
        }
        dp[n] = ClimbingStairsways(n - 1, dp) + ClimbingStairsways(n - 2, dp);
        return dp[n];

    }

    public int ClimbingStairswaysTab(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1];
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }

        }
        return dp[n];

    }

    public int ClimbingStairswaysRecursion(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        return ClimbingStairswaysRecursion(n - 1) + ClimbingStairswaysRecursion(n - 2);

    }

    public static void main(String[] args) {
        ClimbingStairs cb = new ClimbingStairs();
        int stairs = 6;
        int dp[] = new int[stairs + 1];
        int res1 = cb.ClimbingStairsways(stairs, dp);
        int res2 = cb.ClimbingStairswaysRecursion(stairs);
        int res3 = cb.ClimbingStairswaysTab(stairs);
        System.out.println("Via memoization " + res1);
        System.out.println("Via Recursion " + res2);
        System.out.println("Via Tabulation " + res3);
    }
}
