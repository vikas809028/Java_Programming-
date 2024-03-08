package BasicJava;

// public class primrInRange {
//     public static void primeInRange (int range) {
//         for(int i=2;i<=range;i++){
//             boolean isPrime = true;
//             for(int j=2;j<=(i-1);j++){
//                 if(i%j==0){
//                     isPrime = false;
//                 }

//             }
//             if(isPrime==true){
//                 System.out.println(i);

//             }
//         }
//     }
//     public static void main(String[] args) {
//         primeInRange(10);
//     }
// }





// *******************   METHOD 2   ********************



public class primrInRange {

    public static boolean isPrime(int num){
    for(int i=2;i<= Math.sqrt(num);i++)
    {
        if(num%i==0){
            return false;
        }
    }
    return true;

    }

    public static void primeInRange(int num){
        for(int i=2;i<num;i++){
            isPrime(i);
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
      primeInRange(50);
      
    }
}