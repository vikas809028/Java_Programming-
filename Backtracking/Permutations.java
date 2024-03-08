public class Permutations {
    public static void findPermutations(String str,String ans){

        // base case
        if( str.length()== 0)
        {
            System.out.println(ans);
            return;
        }

        for(int i = 0; i < str.length() ; i++ ){ 
            char curr = str.charAt(i);
            // if we do it using str then every time its length will be decreased 
            String Newstr = str.substring(0, i) + str.substring(i+1);
            findPermutations(Newstr,ans+curr);
            
        }
        
    }
    public static void main(String[] args) {
        String str =  "abc";
        findPermutations(str , "");

    }
}
