package DynamicProgramming;

public class Memoization {

    public int fib(int n, int[] dp) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        dp[n] = fib((n - 1), dp) + fib((n - 2), dp);
        return dp[n];
    }

    public static void main(String[] args) {
        Memoization m = new Memoization();
        int n = 8;
        int dp[] = new int[n + 1];
        int result = m.fib(n, dp);
        System.out.println("The " + n + "th number in fibonacci sequence is : " + result);

    }
}