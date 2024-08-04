package Array;

public class Initialization {

    public static void print(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        // datatype arrayname = new type[size]
        int marks1[] = new int[5];
        int[] marks2 = new int[3];
        int[] marks3 = { 1, 2, 3, 4 };
        int marks4[] = { 2, 3, 4, 5, 6, 7 };
        // int marks2[] =[1,2,3,4,5]; not valid
        print(marks1);
        System.out.println();
        print(marks2);
        System.out.println();
        print(marks3);
        System.out.println();
        print(marks4);

    }
}
