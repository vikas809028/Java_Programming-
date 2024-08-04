package Array;

public class PassingArrayAsArgument {

    public static void update(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 1;
        }
    }

    // array are passed as call by referencs if we pass array in another func and
    // perform changes than that changes also reflect in original array

    public static void main(String[] args) {
        int marks[] = { 1, 2, 3, 4 };
        update(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
            ;
        }

    }
}
