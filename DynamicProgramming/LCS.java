package DynamicProgramming;

public class LCS {
    public static String LCS(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        int[][] dp = new int[m + 1][n + 1];

        // Building the dp array
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Reconstructing the LCS from the dp array
        StringBuilder lcs = new StringBuilder();
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                lcs.append(str1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        // LCS is built backwards, so reverse it
        return lcs.reverse().toString();
    }

    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "acef";
        String lcs = LCS(str1, str2);
        System.out.println("Length of Longest Common Subsequence: " + lcs.length());
        System.out.println("Longest Common Subsequence: " + lcs);
    }
}
