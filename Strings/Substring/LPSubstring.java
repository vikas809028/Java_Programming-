package Substring;

public class LPSubstring {
    public static String LPS(String str) {
        int n = str.length();
        String maxStr = "";
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String newStr = str.substring(i, j + 1);
                if (isPalindrome(newStr) && newStr.length() > maxStr.length()) {
                    maxStr = newStr;
                }
            }
        }
        return maxStr;
    }

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(LPS("babababababbb"));
    }
}
