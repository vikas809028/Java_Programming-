package BST_Part_2;

import java.util.ArrayList;

public class MergeTwoBSTs {
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
    public static Node builtBST(Node root,int val){
        if(root == null){
            return new Node(val);
        }
        else if(root.data==val){
            System.out.println("you have entered repeated value "+val+" and This code support only unique values : okk");
        }
        if(root.data>val){
            root.left = builtBST(root.left, val);
        }
        if(root.data<val){
            root.right = builtBST(root.right, val);
        }
        return root;
    }
    public static Node ToBalacedBST(ArrayList<Integer> list,int si,int ei){
        if(si>ei){
            return null; 
        }
        int mid = (si+ei)/2;
        Node root = new Node(list.get(mid));
        root.left = ToBalacedBST(list, si, mid-1);
        root.right = ToBalacedBST(list, mid+1, ei);
        return root;
    }
    public static ArrayList<Integer> inOrderlist(Node root, ArrayList<Integer> list){
        if(root==null){
            return list;
        }
        inOrderlist(root.left,list);
        list.add(root.data);
        inOrderlist(root.right,list);
        return list;

    }

    public static Node mergeBST(Node root1,Node root2){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> rootlist1 = new ArrayList<>();
        ArrayList<Integer> rootlist2 = new ArrayList<>();
        rootlist1 = inOrderlist(root1, rootlist1);
        rootlist2 = inOrderlist(root2, rootlist2 );
        int i=0,j=0;
        while(i<rootlist1.size() && j<rootlist2.size()){
            if(rootlist1.get(i)<=rootlist2.get(j)){
                list.add(rootlist1.get(i++));
            }
            else{
                list.add(rootlist2.get(j++));
            }

        }
        while(i<rootlist1.size()){
            list.add(rootlist1.get(i++));
        }
        while(j<rootlist2.size()){
            list.add(rootlist2.get(j++));
        }
        Node root = null;
        root = ToBalacedBST(list, 0, list.size()-1);
        return root;

    }

    public static void inOrderTraversal(Node root){
        if(root==null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);
    }

    //------------------------------------MainFunction----------------------------------------------
    public static void main(String[] args) {
        int[] nodes1 = {5,4,6,7};
        Node root1 = null;
        for(int i =0;i<nodes1.length;i++){
            root1 = builtBST(root1,nodes1[i]);
        }
        System.out.println("InOrder traversal of First BST is :");
        inOrderTraversal(root1);
        System.out.println();
        int[] nodes2 = {8,3,2,9};
        Node root2 = null;
        for(int i =0;i<nodes2.length;i++){
            root2 = builtBST(root2,nodes2[i]);
        }
        System.out.println("InOrder traversal of Second BST is :");
        inOrderTraversal(root2);
        System.out.println();
        System.out.println("InOrder traversal of Merged BST is :");
        inOrderTraversal(mergeBST(root1, root2));
    }
}
