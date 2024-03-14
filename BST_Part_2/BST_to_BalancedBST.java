package BST_Part_2;

import java.util.ArrayList;

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
    //-----------------------------------------insertInBST--------------------------------------
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

    //-------------------BST_To_Balanced_BST----------------------
    public static Node BSTtoBalancedBST(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        list = inOrder(root,list); // add all items in list in sorted form
        
        root = ArrToBalancedBST(list,0,list.size()-1);
       
        return root;

    }
    public static Node ArrToBalancedBST(ArrayList<Integer> list,int si,int ei){
        if (si > ei) {
            return null;
        }
        int mid = (si + ei) / 2;
        Node root = new Node(list.get(mid));

        root.left = ArrToBalancedBST(list, si, mid - 1);
        root.right = ArrToBalancedBST(list, mid + 1, ei);
        return root;
    }

    public static ArrayList<Integer> inOrder(Node root,ArrayList<Integer> list){
        if(root==null){
            return list;
        }
        inOrder(root.left, list);
        list.add(root.data);
        inOrder(root.right, list);
        return list;

    }

    //-------------------------------------------Traversal----------------------------------------------

    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        
        preOrder(root.right);
    }
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);   
    }
    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        
        postOrder(root.left);
        postOrder(root.right);  
        System.out.print(root.data+" "); 
    }

    //-------------------------------Main-----------------------------------------
    public static void main(String[] args) {
        Node root = null;
        int values[] = {3,4,5,6,2,1,7};
        for(int i =0; i<values.length;i++){
           root =  insertBST(root, values[i]);
        }
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        Node root2 = BSTtoBalancedBST(root);
        preOrder(root2);
        System.out.println();
        inOrder(root2);
        System.out.println();
        postOrder(root2);
    }
    
}
