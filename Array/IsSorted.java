package Array;

// public class IsSorted {

//     public static boolean isSorted(int[] arr) {
//         int n = arr.length - 1;
//         if (arr[0] < arr[1]) {
//             for (int i = 0; i < n; i++) {
//                 if (arr[i] > arr[i + 1]) {
//                     return false;
//                 }
//             }
//         } else {
//             for (int i = 0; i < n; i++) {
//                 if (arr[i] < arr[i + 1]) {
//                     return false;
//                 }
//             }
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 15, 12, 32, 16, 23, 12, 45 };
//         int arr1[] = { 1, 1, 3, 4, 7, 9, 12, 14 };
//         int arr2[] = { 19, 19, 13, 5, 3, 2, 1 };
//         System.out.println(isSorted(arr2));
//     }
// }

class TUF {
    static boolean isSorted(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i])
                    return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 3, 2, 1 }, n = 5;

        System.out.println(isSorted(arr, n));
    }
}
