package BinaryTrees3;

public class TransformToSumTree {
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
    public static int SumTree(Node root){
        if(root == null){
            return 0;
        }

        int leftSum = SumTree(root.left);
        int rightSum = SumTree(root.right);
        int newLeft = root.left==null?0:root.left.data;
        int newright = root.right==null?0:root.right.data;
        // Most important point to remember
        int data = root.data;
        root.data =leftSum+rightSum+newLeft+newright;
        return data;



    }
    public static void preorderTraversal(Node root){  //O(n)
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        preorderTraversal(root);
        System.out.println();
        SumTree(root);
        preorderTraversal(root);

    }
}

