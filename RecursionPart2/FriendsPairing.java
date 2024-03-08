package RecursionPart2;

public class FriendsPairing {
    public static int friendPairing(int n){
       if(n==1 || n==2){
        return n;
       }
       int waysOfSingle = friendPairing(n-1);
       int waysOfPair = n-1*friendPairing(n-2);

       return waysOfPair+waysOfSingle;

    }
    public static void main(String[] args) {
        System.out.println(friendPairing(4));
    }
}
