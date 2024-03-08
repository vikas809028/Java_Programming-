package BasicJava;



public class AdvancedPattern {

    //   *************IT is most Important***************

  public static void  ButterflyPattern(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*" + " ");
        }
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" " + " ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*" + " ");
        }
        System.out.println();

    }
    for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*" + " ");
        }
        for(int j=1;j<=2*(n-i);j++){
            System.out.print(" " + " ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*" + " ");
        }
        System.out.println();

    }
  }




public static void Solid_Rombous(int n) {
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" " + " ");
        }
        for(int j=1;j<=n;j++){
            System.out.print("*" + " ");
        }
        System.out.println();
    
  }
}

public static void Hallow_Rombous(int n) {
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print("  ");
        }
        for(int j=1;j<=n;j++){
            if(i==1 || i==n || j == 1 || j==n){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }}
        System.out.println();
  }
}
public static void Daimond(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print("  ");
        }
        for(int j=1;j<=2*i-1;j++){
            System.out.print("* ");
        }
        System.out.println();
    
  }
  for(int i=n;i>=1;i--){
        for(int j=1;j<=n-i;j++){
            System.out.print("  ");
        }
        for(int j=1;j<=2*i-1;j++){
            System.out.print("* ");
        }
        System.out.println();
    
  }
}

public static void InvertedHalfPyramidPattern(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=(n-i+1);j++){
          System.out.print(j+" ");
      } 
      System.out.println();
  }
}

public static void InvertedRotatedHalfPyramid(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=(n-i);j++)
        {
            System.out.print("  ");
        } 
        // for(int k=n;k>n-i;k--){
        //     System.out.print("*"+" ");
        // }
        for(int k=1;k<=i;k++){
            System.out.print("*"+" ");
        }
        System.out.println();
    }
}
  public static void main(String[] args) {
    ButterflyPattern(5);
    Solid_Rombous(5);
    Hallow_Rombous(5);
    Daimond(4);
    InvertedHalfPyramidPattern(5);
    InvertedRotatedHalfPyramid(5);

  }
}
