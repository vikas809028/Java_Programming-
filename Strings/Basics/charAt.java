package Basics;

public class charAt {
    public static void printLetters(String str1) {
        for (int i = 0; i < str1.length(); i++) {
            System.out.print(str1.charAt(i) + " ");
        }
    }

    public static void main(String[] args) {
        String str1 = "Tony";
        String str2 = "Stark";
        str1 = str1 + " " + str2;

        // System.out.println(str1.charAt(5));
        printLetters(str1);
    }
}
