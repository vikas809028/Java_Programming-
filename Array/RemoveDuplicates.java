package Array;

public class RemoveDuplicates {
    public static int remDup(int[] nums){
        int n = nums.length;
        int[] expNums = new int[n];
        int j = 0;
        expNums[j++] = nums[0];
        
        for(int i=1; i<n;i++){
            if(nums[i-1]!=nums[i]){
                expNums[j++] = nums[i];
            }
        }
        System.out.println("The arr is : ");
        for(int i =0;i<expNums.length-1;i++){
            System.out.print(expNums[i]+" ");
        }
        System.out.println();
        return j;
    }
    public static void main(String[] args) {
        int[]  arr ={1,1,2};
        int k = remDup(arr);
        System.out.println(k);
    }
}
