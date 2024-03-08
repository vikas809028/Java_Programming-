import java.util.Scanner;
public class MergeSortInteger {

    public static void mergeSort(int arr[], int start, int end) {
        // if(start >= end){
        //     return;
        // }
        
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
}

    public static void merge(int arr[], int start,int mid, int end) {
        int temp[] = new int[end-start+1];
        int i = start;
        int j =mid+1;
        int k=0;
        while(i<=mid && j<=end){
            if(arr[i]<=arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
            }
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=end){
            temp[k++] = arr[j++];
        }

        // for(i=start;i<temp.length;i++){
        //     arr[i] = temp[i]; 
        // }

        for (i = 0; i < temp.length; i++) {
            arr[start + i] = temp[i];
        }
        
    }
    public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + "  ");
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the total number of Elements in array : ");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            int arr[] = new int[n];
            System.out.println("Enter the elements : ");
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            mergeSort(arr,0,arr.length-1);
            printArr(arr);
        }
    }
}
