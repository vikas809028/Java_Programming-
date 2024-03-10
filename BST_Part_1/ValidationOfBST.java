package BST_Part_1;
public class ValidationOfBST{
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
            root.left = insert(root.left,data);
        }
        else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public static boolean ValidateBST(Node root,Node min,Node max){
        if(root==null){
            return true;
        }
        if(min!=null && root.data<= min.data){
            return false;
        }
        else if(max!= null && root.data>=max.data){
            return false;
        }
        else{
            return ValidateBST(root.left, min, root) && ValidateBST(root.right, root, max);
        }

    }
    public static void main(String[] args) {
        //-----------------Valid BST generated Directly----------------------------

        // Node root = new Node(5);
        // root.left = new Node(3);
        // root.right  = new Node(6);
        // root.left.left = new Node(1);
        // root.left.right = new Node(4);
        // root.right.right  = new Node(7);

        //---------------Invalid BST---------------

        // Node root = new Node(4);
        // root.left = new Node(2);
        // root.right  = new Node(6);
        // root.left.left = new Node(1);
        // root.left.right = new Node(5);
        // root.right.right  = new Node(7);

        //----------------------Always Valid built tree insert function-------------------

        Node root = null;
        int values[] = {3,4,5,6,7,8,9,2}; // on duplicates it return unvalid
        for(int i =0; i<values.length;i++){
           root =  insert(root, values[i]);
        }
        if(ValidateBST(root, null, null)){
            System.out.println("Tree is Valid");
        }
            else{
                System.out.println("Tree is invalid");
            }
        
    }
}