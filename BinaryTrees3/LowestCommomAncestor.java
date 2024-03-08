package BinaryTrees3;

import java.util.ArrayList;

public class LowestCommomAncestor {
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
    //------------------------------         ----Aproach 1------------------------------------------
    public static Boolean getPath(Node root,int n,ArrayList<Node> list){
        if(root==null){
            return false;
        }
        list.add(root);

        if(root.data == n){
            return true;
        }

        boolean leftPath = getPath(root.left, n, list);
        boolean rightPath = getPath(root.right, n, list);

        if( leftPath||rightPath ){

            return true;

        }
        list.remove(list.size()-1);
        return false;

    }

    public static Node LCA1(Node root,int n1,int n2){
        ArrayList<Node> list1 = new ArrayList<>();
        ArrayList<Node> list2 = new ArrayList<>();

        getPath(root,n1,list1);
        getPath(root,n2,list2);
        int i = 0;
        
        for( ; i < list1.size() && i< list2.size();i++){

            if(list1.get(i)!=list2.get(i)){
                break;
            }
        }
        Node lca  = list1.get(i-1);
        return lca;

    }
    //---------------------------LCA2(Most efficient) no extra memory----------------------------
    
    public static Node LCA2(Node root,int n1,int n2){
        if(root == null){
            return root;
        }
        if(root.data == n1 || root.data == n2){
            return root;
        }
        Node leftLca = LCA2(root.left, n1, n2);
        Node rightLca = LCA2(root.right, n1, n2);
        if(leftLca == null){
            return rightLca;
        }
        if( rightLca == null){
            return leftLca;
        }
        return root;
    } 
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        Node lca = LCA2(root, 4, 5);
        System.out.println("The lowest Common ancestor is : "+lca.data);
    }
}
