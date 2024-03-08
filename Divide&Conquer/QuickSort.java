import java.util.Scanner;

public class QuickSort {
    public static void quickSort(int arr[], int si, int ei)
    {
        if(si >= ei ){
            return;
        }

        int pIdx = partition(arr,si,ei);
        quickSort(arr, si, pIdx-1);
        quickSort(arr, pIdx+1, ei);
    }

    public static int partition(int arr[],int si, int ei)
    {
        int pivot = arr[ei];
        int i = si - 1;
        int j = si;

        while(j < ei){

            if(arr[j] <= pivot){
                i = i+1;
                int temp = arr[j];
                arr[j] = arr [i];
                arr[i] = temp;
            }

            j++;
        }
        
        i = i+1;
        int temp = pivot;
        arr[ei] = arr [i];
        arr[i] = temp;
        return i;
        
    }

    public static void printArr(int arr[])
    {
        for(int i = 0 ; i < arr.length ; i++ ){
                System.out.print(arr[i] + " ");
            }
    }

    public static void main(String[] args)
     {
        try (Scanner sc = new Scanner(System.in)) {
            int arr[] = new int[6];
            System.out.println("Enter the elements of array");
            for(int i = 0 ; i < arr.length ; i++ ){
                arr[i] = sc.nextInt();
            }
            int end =arr.length-1;
            quickSort(arr, 0, end);
            printArr(arr);
        }
    }
}
