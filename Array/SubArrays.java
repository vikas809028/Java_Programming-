package Array;

public class SubArrays {
    public static int subArray(int arr[]) {
        int tl = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");

                }
                tl = tl + 1;
                System.out.println();
            }
        }
        return tl;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 9 };
        int tl = subArray(arr);
        System.out.println();
        System.out.println("Total numbers of pairs " + tl);

    }

}
