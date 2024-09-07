package Subsequences;

import java.util.*;

public class AllSubsequences {

    public static ArrayList<String> subsequences(String str, ArrayList<String> al, StringBuilder sb, int i) {
        // Base case: If we've processed the entire string
        if (i == str.length()) {
            al.add(sb.toString());
            return al;
        }

        // Include the current character in the subsequence
        subsequences(str, al, sb.append(str.charAt(i)), i + 1);

        // Backtrack: Remove the last added character to explore the other option
        sb.setLength(sb.length() - 1);

        // Exclude the current character and move to the next
        subsequences(str, al, sb, i + 1);

        return al;
    }

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        // Generate all subsequences of the string "abc"
        ArrayList<String> ans = subsequences("abc", al, sb, 0);

        // Output the total number of subsequences
        System.out.println("Total Subsequences: " + ans.size());

        // Output all the subsequences
        for (String s : ans) {
            System.out.print("{" + s + "} ");
        }
    }
}
