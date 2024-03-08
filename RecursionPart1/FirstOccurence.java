public class FirstOccurence {
    public static int firstOccurence(int[] arr, int target , int i){
        if(i==arr.length){
            System.out.println("Not exist");
            return -1;
        }
        else if(arr[i] == target){
            return i;
        }

        return firstOccurence(arr, target, i+1);
    
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,2,7,3,7};
        System.out.print(firstOccurence(arr, 9, 0));

    }
}
