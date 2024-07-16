package DynamicProgramming;

class SubsetSumMemoization {

    static int subsetSum(int a[], int n, int sum) {
        // initialize every index with -1
        int tab[][] = new int[n + 1][sum + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                tab[i][j] = -1;
            }
        }

        if (sum == 0)
            return 1;

        if (n <= 0)
            return 0;
            
        if (tab[n - 1][sum] != -1)
            return tab[n - 1][sum];

        // If the value of a[n-1] is
        // greater than the sum.
        // we call for the next value
        if (a[n - 1] > sum)
            return tab[n - 1][sum] = subsetSum(a, n - 1, sum);
        else {

            // Here we do two calls because we
            // don't know which value is
            // full-fill our criteria
            // that's why we doing two calls
            if (subsetSum(a, n - 1, sum) != 0
                    || subsetSum(a, n - 1, sum - a[n - 1]) != 0) {
                return tab[n - 1][sum] = 1;
            } else
                return tab[n - 1][sum] = 0;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int a[] = { 1, 5, 3, 7, 4 };
        int sum = 12;

        if (subsetSum(a, n, sum) != 0) {
            System.out.println("YES\n");
        } else
            System.out.println("NO\n");
    }
}
