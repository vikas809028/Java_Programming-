import java.util.Scanner;

public class palinDrome {
    public static void palindrome (String str)
    {
        Boolean isPalindrone = true;
        for(int i=0; i<=str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1))
            {
                isPalindrone = false;
            }
        }
        if(isPalindrone == true){
            System.out.print("String is Palindrome");
        }
        else{
            System.out.print("String is not Palindrome");
        }
    }

    public static Boolean isPalindrome(String str)
    {
        for(int i=0; i<=str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.next();
            //palindrome(str);
            System.out.print(isPalindrome(str));

        }

    }
}
