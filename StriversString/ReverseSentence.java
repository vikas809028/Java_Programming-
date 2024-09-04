package StriversString;

import java.util.Stack;

public class ReverseSentence {
    public static void len(String s) {
        System.out.println(s.length());
    }

    public static void main(String[] args) {
        String s = " Hello      what   are     you doing  today .!";
        len(s);
        Stack<String> st = new Stack<>();
        StringBuilder word = new StringBuilder();

        // Split words and push them onto the stack
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                word.append(s.charAt(i));
            } else if (word.length() > 0) {
                // Only push non-empty words to the stack
                st.push(word.toString());
                word.setLength(0); // reset the word
            }
        }
        // Push the last word, if any
        if (word.length() > 0) {
            st.push(word.toString());
        }

        StringBuilder answer = new StringBuilder();

        // Pop words from the stack to reverse the sentence
        while (!st.empty()) {
            answer.append(st.pop()).append(" ");
        }

        String finalAnswer = answer.toString().trim(); // trim the trailing space
        len(finalAnswer);
        System.out.println(finalAnswer); // print the final reversed sentence
    }
}
