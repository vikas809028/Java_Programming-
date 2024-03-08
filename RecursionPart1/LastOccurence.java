public class LastOccurence {
    
    public static int lastOccurence(int[] arr, int target , int i){

        if(i<0){
            System.out.println("Not exist");
            return -1;
        }
        else if(arr[i] == target){
            return i;
        }

        return lastOccurence(arr, target, i-1);

        //********************concept by apna college*******************************/
        
        // if(i==arr.length){
        //     return -1;
        // }
        // int isFound = lastOccurence(arr, target, i++);
        // if(isFound==-1 && arr[i] == target){
        //     return i;
        // }
        // return isFound;

    
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.print(lastOccurence(arr, 1, arr.length-1));
        // System.out.print(lastOccurence(arr, 1, 0));

    }
}
