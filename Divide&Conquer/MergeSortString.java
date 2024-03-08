import java.util.Scanner;
//----------------sorting of Strings-----------------------------
public class MergeSortString {

    public static void mergeSort(String[] arr, int si, int ei) {
        if (si < ei) {
            int mid = si + (ei - si) / 2;
            mergeSort(arr, si, mid);
            mergeSort(arr, mid + 1, ei);
            merge(arr, si, mid, ei);
        }
    }

    public static void merge(String[] arr, int si, int mid, int ei) {
        // it is comverted into String array
        
        int n1 = mid - si + 1;
        int n2 = ei - mid;

        String[] leftArray = new String[n1];
        String[] rightArray = new String[n2];

        for (int i = 0; i < n1; ++i) {
            leftArray[i] = arr[si + i];
        }
        for (int j = 0; j < n2; ++j) {
            rightArray[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = si;

        while (i < n1 && j < n2) {
            if (leftArray[i].compareTo(rightArray[j]) <= 0) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void printArr(String[] arr) {
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
    public static void mergeSort(){
        
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of elements in the array:");
            int n = sc.nextInt();
            sc.nextLine(); // Consume the newline character as we are going to take string as input

            String arr[] = new String[n];
            System.out.println("Enter the elements of the array (all in lowercase):");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLine();//consume total line and used to take string as input while sc.next take only character
            }

            mergeSort(arr, 0, n - 1);

            System.out.println("Sorted array:");
            printArr(arr);
        }
    }
}


