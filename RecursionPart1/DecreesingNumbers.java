import java.util.Scanner;
public class DecreesingNumbers {

    public static void decreesingNumbersViaRecursion(int arr[],int n){
        if (n < 0) {
            return;
        }
        System.out.println(arr[n]);
        decreesingNumbersViaRecursion(arr, n - 1);
        
    }
    


    public static void decreesingNumbers(int arr[]){
        int n = arr.length-1;
        System.out.println("The array in reverse ocder is : ");
        for(int i = n ; i >=0 ; i-- ){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int arr[] = {1,2,3,4,5,6};

            // System.out.println("Enter the elements of array");

            // for(int i = 0 ; i < arr.length ; i++ ){
            //     arr[i] = sc.nextInt();
            // }
            int n = arr.length-1; 
            decreesingNumbersViaRecursion(arr,n);
        }
    }
}
