package BST_Part_1;

public class Delete_node {
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

    public static Node inOrderSuccessor(Node root){
        if(root==null){
            return root;
        }
        if(root.left==null){
            return root;
        }
        else{
            return inOrderSuccessor(root.right);
        }
    }

    public static Node delete(Node root, int data){
        if(root==null){
            return root;
        }
        if(root.data>data){
            root.left = delete(root.left, data);
        }
        else if(root.data<data){
            root.right = delete(root.right, data);
        }
        else{
            // case -1 no child
            if(root.left==null&&root.right==null){
                return null;
            }
            // case---2 1 child
            if(root.left==null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            // case--3
            Node IS = inOrderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, data);

        }
        return root;
    }
    public static void main(String[] args) {
        Node root = null;
        int values[] = {3,4,5,6,1};
        for(int i =0; i<values.length;i++){
           root =  insert(root, values[i]);
        }
        inOrder(root);
        delete(root, 1);
        System.out.println();
        inOrder(root);

    }   
}
