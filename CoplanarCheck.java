// class LongestPalinSubstring {
// // Function to print a substring str[low..high]
// static void printSubStr(String str, int low, int high) {
// for (int i = low; i <= high; ++i)
// System.out.print(str.charAt(i));
// System.out.println();
// }

// // Function to find the longest palindromic substring
// static int longestPalSubstr(String s) {
// int n = s.length();
// int start = 0, end = 1;
// int low, hi;

// // Traverse the input string
// for (int i = 1; i < n; i++) {

// // Find longest palindromic substring of even size
// low = i - 1;
// hi = i;

// // Expand substring while it is palindrome and in bounds
// while (low >= 0 && hi < n && s.charAt(low) == s.charAt(hi)) {

// // Update maximum length and starting index
// if (hi - low + 1 > end) {
// start = low;
// end = hi - low + 1;
// }
// low--;
// hi++;
// }

// // Find longest palindromic substring of odd size
// low = i - 1;
// hi = i + 1;

// // Expand substring while it is palindrome and in bounds
// while (low >= 0 && hi < n && s.charAt(low) == s.charAt(hi)) {

// // Update maximum length and starting index
// if (hi - low + 1 > end) {
// start = low;
// end = hi - low + 1;
// }
// low--;
// hi++;
// }
// }

// // Print the longest palindromic substring
// System.out.print("Longest palindrome substring is: ");
// printSubStr(s, start, start + end - 1);

// // Return output length
// return end;
// }

// // Driver code
// public static void main(String[] args) {
// String s = "forgeeksskeegfor";
// int length = longestPalSubstr(s);
// System.out.println("Length: " + length);
// }
// }

// Java Program to Convert String to Integer Array
// Using string.replaceAll() method
// import java.util.Arrays;

// public class GFG {
//     public static void main(String[] args) {
//         // Declaring the string
//         String str = "[1,2,356,678,3378]";

//         // Replacing brackets and splitting the string into an array
//         String[] string = str.replace("[", "")
//                 .replace("]", "")
//                 .split(",");

//         // Declaring an array with the size of the string array
//         System.out.println(string.length);
//         int[] arr = new int[string.length];

//         // Parsing the String array into an integer array
//         for (int i = 0; i < string.length; i++) {
//             arr[i] = Integer.parseInt(string[i]);
//         }

//         // Printing the original string
//         System.out.println("String : " + str);

//         // Printing the integer array
//         for (int i = 0; i < arr.length; i++)
//             System.out.print(arr[i] + " ");

//         // Printing the integer array
//         System.out.println("Integer Array : " + Arrays.toString(arr));
//     }
// }

public class CoplanarCheck {

    // Method to check if four points are coplanar
    public static boolean arePointsCoplanar(int[] A, int[] B, int[] C, int[] D) {
        // Vector AB = B - A
        int[] AB = { B[0] - A[0], B[1] - A[1], B[2] - A[2] };
        // Vector AC = C - A
        int[] AC = { C[0] - A[0], C[1] - A[1], C[2] - A[2] };
        // Vector AD = D - A
        int[] AD = { D[0] - A[0], D[1] - A[1], D[2] - A[2] };

        // Compute the cross product of AC and AD
        int[] crossProduct = {
                AC[1] * AD[2] - AC[2] * AD[1],
                AC[2] * AD[0] - AC[0] * AD[2],
                AC[0] * AD[1] - AC[1] * AD[0]
        };

        // Compute the dot product of AB and the cross product of AC and AD
        int dotProduct = AB[0] * crossProduct[0] + AB[1] * crossProduct[1] + AB[2] * crossProduct[2];

        // If the dot product is 0, the points are coplanar
        return dotProduct == 0;
    }

    public static void main(String[] args) {
        // Example points
        int[] A = { 1, 2, 0 };
        int[] B = { 2, -5778689, 0 };
        int[] C = { 4, 0, 450 };
        int[] D = { 1, 78, 56 };

        // Check if the points are coplanar
        if (arePointsCoplanar(A, B, C, D)) {
            System.out.println("The points are coplanar.");
        } else {
            System.out.println("The points are not coplanar.");
        }
    }
}
