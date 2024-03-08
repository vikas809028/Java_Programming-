package RecursionPart2;

public class TillingProblem {
    public static int tillingProblem(int n) {
        if(n==0  || n==1){
            return 1;
        }

        int vWays = tillingProblem(n-1);
        int hWays = tillingProblem(n-2);
        return vWays+hWays;
        
    }
    public static void main(String[] args) {
        
        System.out.println(tillingProblem(5));
    }
}
