
import java.util.Scanner;


public class ArrayBacktracking {

    //***********ARRAY ARE CALLED IN JAVA BY CALL BY REFERENCE AND CHANGE ARE VISIBLE EVERYWHERE******** 

    public static void backTrackArray(int[] arr , int index ,int value) {

        //BASE CASE
        if( index == arr.length){
            // printarray(arr);
            return ;
        }
        arr[index] = value;
        //RECURSIVE PART
        backTrackArray(arr, index+1, value+1);
        //BACKTRACKING 
        arr[index] = arr[index]-2;
    }
    public static void printarray(int[] arr){
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
            System.out.println();
        }   
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of elements in array : ");
            int n = sc.nextInt();
            //System.out.println("Enter the elements : ");
            int[] arr = new int[n];
            // for(int i = 0;i<n;i++){
            //     arr[i ]= sc.nextInt();
            // }
            backTrackArray(arr, 0, 1);
            System.out.println("The array after backtracking is : ");
            printarray(arr);
        }
    }
}
