package Substring;

public class ExpandaroundCenter {

    public static String palindrome(String str) {

        // for print the palindromin string
        int start = 0;

        int length = 1;

        int low, high;

        for (int i = 0; i < str.length(); i++) {
            // for odd length
            low = i - 1;
            high = i + 1;
            while (low >= 0 && high < str.length() && str.charAt(low) == str.charAt(high)) {
                if (high - low + 1 > length) {
                    start = low;
                    length = high - low + 1;
                }
                low--;
                high++;
            }
            // for even length
            low = i - 1;
            high = i;
            while (low >= 0 && high < str.length() && str.charAt(low) == str.charAt(high)) {
                if (high - low + 1 > length) {
                    start = low;
                    length = high - low + 1;
                }
                low--;
                high++;
            }

        }
        return str.substring(start, start + length);
    }

    public static void main(String[] args) {
        System.out.println(palindrome("aabaacaab"));
        System.out.println(palindrome("rracecarrrerr"));
    }
}
