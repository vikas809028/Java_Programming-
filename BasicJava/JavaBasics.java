package BasicJava;

import java.util.*;  //.* import Scanner as well other class while .Scanner import only Scanner class

public class JavaBasics {
    public static void main(String args[])
     {
        //try(Scanner sc = new Scanner(System.in)){               
        // int a = sc.nextInt ();
        // int b = sc.nextInt();
        // int mul = a*b;
        // //int sum = a+b;
        // //System.out.println(sum);
        // System.out.println(mul);}
        try(Scanner sc = new Scanner(System.in)){
        //float r = sc.nextFloat();
        float r = sc.nextFloat();//it is allowed in java to store compatible data in higher destination type
        float area = 3.14f * r * r;
        // decimal values are treated as generally double but all
        // values are in float so we used here 3.14f to convert it in float.
        System.out.println(area);

        }
      


     }
}

 

    

