import java.util.Scanner;
public class PowerFunction{

    //  optimized way to calculate power
    public static int pow(int n,int m){
        if(m == 1){
            return n;
        }
        return n*pow(n, m-1);
    }
    public static int optimizedPow(int n,int m){
        if(m == 0){
            return 1;
        }
        
        int value = optimizedPow(n, m/2) * optimizedPow(n, m/2);

        // int value = optimizedPow(n, m/2)
        //int value = value*vlaue;
        // less number of calls in this method more optimized method

        if(m%2==0){
            return value;
       }
        
        return n*value;

    }
    public static void main(String[] args) {
        try(Scanner sc  = new Scanner(System.in);){
        System.out.println("Enter a number : ");
        int n = sc.nextInt(); 
        System.out.println("Enter the power of number");
        int m = sc.nextInt(); 

        // System.out.println("The value of the power is " + pow(n,m));
        System.out.println("The value of the power is " + optimizedPow(n,m));
    }
}
}