import java.util.Scanner;

public class SortedArray {
    public static Boolean checkSorted(int arr[],int i){
        if( i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return checkSorted(arr, i+1);
        
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            
            int array1[] = {3,5,8,9,1,4};

            int array2[] = {1,2,3,4,5,6,7};


            //System.out.println("Enter the size of array :");
            //int n = sc.nextInt();
            // int[] array = new int[n];
            // System.out.println("Enter the elements of array :");
            // for(int i = 0 ;i < n ; i++){
            //     array[i] = sc.nextInt();
            // }

            System.out.println(checkSorted(array1, 0));
            System.out.println(checkSorted(array2, 0));


        }
    }
}
