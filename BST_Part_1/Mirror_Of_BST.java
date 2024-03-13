package BST_Part_1;
public class Mirror_Of_BST{
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(){

        }
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root,int data){
        if(root==null){
            root = new Node(data);
            return root;
        }
        if(data<root.data){
            root.left = insert(root.left,data);
        }
        else {
            root.right = insert(root.right, data);
        }
        return root;
    }
    public static void preOrderTraversal(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static Node mirrorBst(Node root) {
        if(root==null){
            return root;
        }
        Node leftSubTree = mirrorBst(root.left);
        Node rightSubTree = mirrorBst(root.right);

        root.left = rightSubTree;
        root.right = leftSubTree;
        return root;
    }
    public static void main(String[] args) {
        Node root = null;
        int values[] = {3,4,5,6,2};
        for(int i =0; i<values.length;i++){
           root =  insert(root, values[i]);
        }
        preOrderTraversal(root);
        mirrorBst(root);
        System.out.println();
        preOrderTraversal(root);
    }
}