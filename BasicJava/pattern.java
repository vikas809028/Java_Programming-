package BasicJava;

public class pattern {
    public static void main(String[] args) {

    //*********** SATR PATTERN  *************
    
    // int i,j;
    // for(i=1;i<=4;i++){
    //     for(j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    // //System.out.print("\n");
    // System.out.println();
    // }



    //*********** INVERTED STAR PATTERN   ************* 

    // for(int i= 1;i<=4;i++){
    //     for(int j=i;j<=4;j++){
    //       System.out.print("*");
    //     }
    //     System.out.println();
    // }





    //***************  HALF PYRAMID PATEERN  *****************
    
    // for(int i=1;i<=4;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(j+" ");
    //     }
    //     System.out.println();
    // }


    //***************  HALF PYRAMID PATEERN IN SERIES OF NUMBERS ********************
    //   int number=1;
    //   for(int line=1;line<=4;line++){
    //     for(int j=1;j<=line;j++){
    //         System.out.print(number+" ");
    //         number+=1;
    //     }
    //     System.out.println();
    // }


    //***************  HALF PYRAMID PATEERN IN SERIES OF CHARACTERS ********************
      char number = 65;
      //char number="A"
      for(int line=1;line<=4;line++){
        for(int j=1;j<=line;j++){
            System.out.print(number+" ");
            number++;
        }
        System.out.println();
    }

}
}
