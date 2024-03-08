package BinaryTrees3;

import java.util.Scanner;

public class KthLevelOfTree {

    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data= data;
            this.left = null; 
            this.right = null;
        }
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh,rh)+1;

    }
    public static void printKthlevel(Node root,int level,int k){
        if(root==null){
            return ;
        }
        if(level == k){
            System.out.print(root.data+" ");
            return;
        }
        printKthlevel(root.left, level+1, k);
        printKthlevel(root.right, level+1, k);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        /*------------------- Tree will be like this----------
                     1 
                   /   \
                  2     3
                 / \   / \
                4   5 6   7
        
                */
        try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter the level of tree : ");
        int n = sc.nextInt();
        int h = height(root);
        if(n>h){
            System.out.println("Enter valid level(Your level is greater than tree level)");
        }
        printKthlevel(root, 1, n);
        }


    }
}
