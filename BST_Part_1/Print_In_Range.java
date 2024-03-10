package BST_Part_1;

public class Print_In_Range {
    public static class Node{
        int data;
        Node left;
        Node right;
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
            root.left =  insert(root.left, data);
        }
        else{
            root.right = insert(root.right,data);
        }
        return root;
    }
    // public static void inOrderTraversal(Node root){
    //     if(root==null){
    //         return;
    //     }
    //         inOrderTraversal(root.left);
    //         System.out.print(root.data+" ");
    //         inOrderTraversal(root.right);
    // }
    public static void printRange(Node root,int n1,int n2){
        if(root==null){
            return;
        }
        if(n1<=root.data && root.data<=n2){
            printRange(root.left,n1,n2);
            System.out.print(root.data+" ");
            printRange(root.right,n1,n2);

        }
        else if(n1>root.data){
            printRange(root.right,n1,n2);
        }
        else{
            printRange(root.left,n1,n2);
        }

    }
    public static void main(String[] args) {
        Node root = null;
        int[]  values = {5,6,1,2,4,7};
        for(int i = 0 ;i<values.length;i++){
            root = insert(root,values[i]);
        }
        // System.out.println(root.data);
        // inOrderTraversal(root);
        printRange(root, 2, 6);
    }

}
