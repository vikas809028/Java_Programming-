package Substring;

import java.util.*;

public class LonSubWithoutPepeatChar {

    public static int approach1(String str) {
        // TimeComplexity = O(2n) as we not directly jump to matching character
        // space complexity=O(n)
        int maxLen = Integer.MIN_VALUE;

        int l = 0;
        int start = 0;
        Set<Character> se = new HashSet<>();
        for (int r = 0; r < str.length(); r++) {
            while (l < r && se.contains(str.charAt(r))) {
                se.remove(str.charAt(l));
                l++;
            }
            se.add(str.charAt(r));
            // maxLen = Math.max(maxLen, (r - l + 1));
            if ((r - l + 1) > maxLen) {
                start = l;
                maxLen = (r - l + 1);
            }

        }
        System.out.println(str.substring(start, start + maxLen));

        return maxLen;
    }

    public static int approach2(String str) {
        // TimeComplexity = O(2n) as we not directly jump to matching character
        // space complexity=O(n)
        int maxLen = Integer.MIN_VALUE;

        int l = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int r = 0; r < str.length(); r++) {
            if (map.containsKey(str.charAt(r))) {
                l = Math.max(map.get(str.charAt(r)) + 1, l);
            }
            map.put(str.charAt(r), r);
            maxLen = Math.max(maxLen, (r - l + 1));
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String str = "takeuforword";
        int l1 = approach1(str);
        System.out.println(l1);
        // int l2 = approach2(str);
        // System.out.println(l2);
    }
}
