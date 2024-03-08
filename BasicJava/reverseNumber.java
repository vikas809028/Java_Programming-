package BasicJava;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        try (Scanner sc = new Scanner(System.in)) {
            int number= sc.nextInt();
            int reverse = 0;
            int num = number;
            while(num!= 0)   //reverse!= number
            {  
            // int remainder = number % 10;  
            reverse = reverse * 10 + (num % 10);  
            num = num/10;  
            }  
            System.out.println("The reverse of the given number is: " + reverse);  

        
    }  
} 
}   
        
// import java.util.Scanner;   
// public class reverseNumber 
// {  
// public static void main(String args[])   
// {  
// try (Scanner sc = new Scanner(System.in)) {
//     int number= sc.nextInt(); int reverse = 0;  
// while(number != 0)   
// {  
// int remainder = number % 10;  
// reverse = reverse * 10 + remainder;  
// number = number/10;  
// }  
// System.out.println("The reverse of the given number is: " + reverse);  
  
// }  
// }}