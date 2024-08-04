package Array;

public class TrappingRainWater {
    public static int calculateTrappedWater(int height[]) {
        // minimum array length must be 3 to calculate trapped water
        // Heigth Array should not be in ascending or descending order
        int n = height.length;

        // calculate leftmax array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // calculating rightmax array

        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int trappedWater = 0;
        // loop
        for (int i = 0; i < n; i++) {
            // main formula to calculate water
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println("the total trapped water is : " + calculateTrappedWater(height));
    }
}
