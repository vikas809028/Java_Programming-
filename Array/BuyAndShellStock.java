package Array;

public class BuyAndShellStock {
    // time Complexity = O(n)
    public static int buyAndSell(int price[]) {
        int bp = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < price.length; i++) {
            if (bp < price[i]) {
                int profit = price[i] - bp;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                // agar abhi tak profit nhi hus to aaj buy kr lete hai
                bp = price[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int price[] = { 7, 1, 5, 3, 6, 8 };
        System.out.println(buyAndSell(price));
    }
}
