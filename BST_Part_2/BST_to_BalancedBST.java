package BST_Part_2;

public class BST_to_BalancedBST {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }
    public static Node insertBST(Node root,int data){

        if(root==null){
            root= new Node(data);
            return root;
        }
        if(data<root.data){
            root.left = insertBST(root.left, data);
        }
        if(data>root.data){
            root.right =  insertBST(root.right, data);
        }
        return root;
    }
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void main(String[] args) {

        // Node root = new Node(5);
        // root.left = insertBST(root, 4);
        // root.left.left = insertBST(root, 3);
        // root.left.left.left = insertBST(root, 2);
        // root.right = insertBST(root, 6);
        // root.right.right = insertBST(root, 7);
        // root.right.right.right =insertBST(root, 8);
        Node root = null;
        int values[] = {3,4,5,6,2};
        for(int i =0; i<values.length;i++){
           root =  insertBST(root, values[i]);
        }
        inOrder(root);
    }
}
