package Array;

import java.util.ArrayList;

class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public static void sort012(ArrayList<Integer> arr) {
        int one = 0, two = 0, zero = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 0) {
                zero++;
            } else if (arr.get(i) == 1) {
                one++;
            } else if (arr.get(i) == 2) {
                two++;
            }
        }
        arr.clear();
        while (zero > 0) {
            arr.add(0);
            zero--;
        }
        while (one > 0) {
            arr.add(1);
            one--;
        }
        while (two > 0) {
            arr.add(2);
            two--;
        }
        System.out.print(arr);
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);
        al.add(1);
        al.add(2);
        al.add(0);
        al.add(2);
        System.out.print(al);
        System.out.println("After sorting");
        sort012(al);
    }
}