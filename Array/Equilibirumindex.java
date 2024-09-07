package Array;

public class Equilibirumindex {
    public static int Equilibirumindexx(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int leftSum = 0, rightSum = sum;
        for (int i = 0; i < arr.length; i++) {
            rightSum -= arr[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;

    }

    public static void main(String[] args) {
        int a[] = { 1, 3, 4, 1, 8, 6, 3 };
        int idx = Equilibirumindexx(a);
        System.out.println(idx);
    }
}
