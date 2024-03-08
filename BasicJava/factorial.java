package BasicJava;
// package BasicJava;

import java.util.Scanner;
public class factorial {

public static int Factorial (int num){
    if(num == 0)
    {
        return 1;
    }
    else if(num == 1)
    {
        return  1;
    }
    else
    {
        return num*Factorial(num-1);
    }
}

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();
            int fact = Factorial(number);
            System.out.println("Factorial of " + number + " is " + fact);
        }
    }

  
   
}
