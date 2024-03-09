package BST_Part_1;

public class InOrderTraversal {
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

        public static void inOrder(Node root){
            if(root==null){
                return ;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);

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
    public static void main(String[] args) {
        Node root = null;
        int values[] = {3,4,5,6,2};
        for(int i =0; i<values.length;i++){
           root =  insert(root, values[i]);
        }
        System.out.println("The root of the tree is: "+root.data);
        inOrder(root);
    }   
}
