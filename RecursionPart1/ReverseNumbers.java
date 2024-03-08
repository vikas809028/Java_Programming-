import java.util.Scanner;

public class ReverseNumbers {
    public static void reverseNaturalNumbers(int n) {
        if(n==1){
            System.out.print(n+ " ");
            return;
        }
        else{
            System.out.print(n+" ");// print in reverse order till 0
            reverseNaturalNumbers(n-1);
            System.out.print(n+" "); //print in original order from 0
            
        }
        
    }
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
        
            reverseNaturalNumbers(n);
        }
    }
}
