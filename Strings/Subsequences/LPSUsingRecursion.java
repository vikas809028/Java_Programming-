package Subsequences;

class Solution2 {

    public static String longestPalindromeSubseq(String s) {
        return longestPalindromeSubseqHelper(s, 0, "");
    }

    private static String longestPalindromeSubseqHelper(String s, int index, String current) {
        if (index == s.length()) {
            if (isPalindrome(current)) {
                return current;
            } else {
                return "";
            }
        }

        String exclude = longestPalindromeSubseqHelper(s, index + 1, current);

        String include = longestPalindromeSubseqHelper(s, index + 1, current + s.charAt(index));

        return include.length() > exclude.length() ? include : exclude;
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
        System.out.println(longestPalindromeSubseq("abcb"));
    }
}