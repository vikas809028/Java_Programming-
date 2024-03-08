package BasicJava;

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){

            int n = sc.nextInt();
            int counter =1;

            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    // System.out.print(counter+" ");
                    //counter++;


                    //      0-1 Triangle Pattern

                    if(counter==0){
                    System.out.print(counter+" ");
                    counter+=1;
                    }
                    else{
                    System.out.print(counter+" ");
                    counter-=1;
                    }
                    
                } 
                System.out.println();
                //// it also can be printed using the condition (i+j)%2==0 ...
            }
        }
    }
}
