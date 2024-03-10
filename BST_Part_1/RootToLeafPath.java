package BST_Part_1;

import java.util.ArrayList;

public class RootToLeafPath {
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
    public static void printpath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
           System.out.print(path.get(i)+"--->"); 
        }  
        System.out.print("Null\n");
    }
    public static void printroot2leaf(Node root,ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){
            printpath(path);
            // System.out.println(path);
        }
        printroot2leaf(root.left, path);
        printroot2leaf(root.right, path);
        path.remove(path.size()-1);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Node root = null;
        int[]  values = {8,5,10,3,6,11,14};
        for(int i = 0 ;i<values.length;i++){
            root = insert(root,values[i]);
        }
        printroot2leaf(root,list);
    }
}
