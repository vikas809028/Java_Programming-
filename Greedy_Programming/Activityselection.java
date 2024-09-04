package Greedy_Programming;

import java.util.ArrayList;

public class Activityselection {

    public static void maxActivityPossible(int[] start, int[] end) {
        ArrayList<Integer> activityArr = new ArrayList<>();
        int maxAct = 0;

        // 1st activity
        maxAct++;
        activityArr.add(0);

        int lastend = end[0];

        // for other element

        for (int i = 1; i < end.length - 1; i++) {
            if (lastend <= start[i]) {
                maxAct++;
                activityArr.add(i);
                lastend = end[i];
            }
        }
        System.out.println(maxAct);
        System.out.println(activityArr);

    }

    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 9, 10, 10 };
        maxActivityPossible(start, end);

    }
}
