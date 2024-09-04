package StriversString;

import java.util.Stack;

public class Reverse2 {

    public static String reverseSen(String s) {
        int i = s.length() - 1;
        String ans = "";
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            int j = i;
            if (i < 0)
                break;
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            if (ans.isEmpty()) {
                ans = ans.concat(s.substring(i + 1, j + 1));
            } else {
                ans = ans.concat(" " + s.substring(i + 1, j + 1));
            }
        }
        return ans;
    }

    // optimized
    public static void rev(String s) {
        Stack<String> st = new Stack<>();
        int i;
        for (i = 0; i < s.length(); i++) {
            String word = "";

            while (i < s.length() && s.charAt(i) != ' ') {
                word += s.charAt(i);
                i++;

            }
            st.push(word);
        }
        while (!st.empty()) {
            System.out.print(st.pop() + " ");
        }
    }

    public static void main(String[] args) {
        String s = "How are you .    ";
        rev(s);
        System.out.println();
        System.out.println(reverseSen(s));

    }
}
