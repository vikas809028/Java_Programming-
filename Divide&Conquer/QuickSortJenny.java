public class QuickSortJenny {
    public static void quickSort(int arr[] ,int si, int ei) {
        if(si>=ei){
            return;
        }
        int pIdx = partition(arr , si , ei);
        quickSort(arr, si, pIdx-1);
        quickSort(arr, pIdx+1, ei);

    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[si];
        int start = si + 1; // start from the element next to pivot
        int end = ei;
    
        while (start <= end) {
            while (arr[start] <= pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
    
        // Swap pivot with element at end pointer
        int temp = arr[si];
        arr[si] = arr[end];
        arr[end] = temp;
    
        return end; // return the partition index
    }
    
    public static void printArr(int arr[])
    {
        for(int i = 0 ; i < arr.length ; i++ ){
                System.out.print(arr[i] + " ");
            }
    }
    public static void main(String[] args) {
        int arr[] = {1,6,3,8,2,9,15};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);

    }
}
