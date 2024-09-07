package Subsequences;
// class Solution {

//     public static String longestPalindromeSubseq(String s) {
//         return longestPalindromeSubseqHelper(s, 0, "");
//     }

//     private static String longestPalindromeSubseqHelper(String s, int index, String current) {
//         if (index == s.length()) {
//             if (isPalindrome(current)) {
//                 return current;
//             } else {
//                 return "";
//             }
//         }

//         // Option 1: Exclude the current character
//         String exclude = longestPalindromeSubseqHelper(s, index + 1, current);

//         // Option 2: Include the current character
//         String include = longestPalindromeSubseqHelper(s, index + 1, current + s.charAt(index));

//         // Return the longer palindromic subsequence found
//         return include.length() > exclude.length() ? include : exclude;
//     }

//     private static boolean isPalindrome(String s) {
//         int left = 0;
//         int right = s.length() - 1;
//         while (left < right) {
//             if (s.charAt(left) != s.charAt(right)) {
//                 return false;
//             }
//             left++;
//             right--;
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         System.out.println(longestPalindromeSubseq("abcandjwihdwoh"));
//     }
// }

class Solution {
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

            // Check if the generated subsequence is a palindrome
            if (isPalindrome(subsequence.toString())) {
                // Update the longest palindrome if the current one is longer
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
