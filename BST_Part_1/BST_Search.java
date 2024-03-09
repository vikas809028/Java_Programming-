package BST_Part_1;

public class BST_Search {

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
    public static Boolean search(Node root,int data){
        if(root==null){
            return false;
        }
        if(root.data == data){
            return true;
        }
        if(data<root.data){
            return search(root.left,data);
        }
        else {
            return search(root.right, data);
        }
    }
    public static void main(String[] args) {
        Node root = null;
        int values[] = {3,4,5,6,1};
        for(int i =0; i<values.length;i++){
           root =  insert(root, values[i]);
        }
        System.out.println(search(root, 8));
    }
       
}
