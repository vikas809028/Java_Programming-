package Subsequences;

class Solution1 {
    public static String longestPalindromeSubseq(String s) {
        int n = s.length();
        String longestPalindrome = "";

        // There are 2^n possible subsequences
        int totalSubsequences = 1 << n;
        System.out.println(totalSubsequences);

        // Iterate through all possible subsequences
        for (int i = 0; i < totalSubsequences; i++) {
            StringBuilder subsequence = new StringBuilder();

            for (int j = 0; j < n; j++) {
                // Check if the j-th bit in i is set, if yes, include s[j] in the subsequence
                if ((i & (1 << j)) != 0) {
                    subsequence.append(s.charAt(j));
                }
            }

            if (isPalindrome(subsequence.toString())) {

                if (subsequence.length() > longestPalindrome.length()) {
                    longestPalindrome = subsequence.toString();
                }
            }
        }

        return longestPalindrome;
    }

    private static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindromeSubseq("abbacbba"));
    }
}
