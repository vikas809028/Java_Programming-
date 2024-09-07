package Basics;

public class concatenate {
    public static void main(String[] args) {
        String str1 = "Tony";
        String str2 = "Stark";
        // str1 = str1 + str2;
        str1 = str1.concat(str2);
        System.out.println(str1);
    }
}
