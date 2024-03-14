package BST_Part_2;
// we have to given a binary tree and we have to found a binary search tree
public class Size_of_largestBSTinBT {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left= null;
            this.right=null;
        }
    }
    public static class Info{
        boolean isBST;
        int size;
        int min;
        int max;
        Info(boolean isBST,int size,int min,int max){
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    public static int maxBST = 0;

    public static Info largestBST(Node root){
        if(root == null){
            return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }
        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);

        int size = leftInfo.size+rightInfo.size+1;
        int min = Math.min(root.data,Math.min(leftInfo.min,rightInfo.min));
        int max = Math.max(root.data,Math.max(leftInfo.max,rightInfo.max));
        // to chect is root is valid Bst
        if(root.data <= leftInfo.max || root.data >= rightInfo.min){
            return new Info(false,size,min,max);
        }
        // to check left and right
        if(leftInfo.isBST && rightInfo.isBST){
            maxBST = Math.max(maxBST,size);
            return new Info(true,maxBST,min,max);
        }
        return new Info(true,size,min,max);
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(60);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);
        root.right.right.right.right = new Node(90);

        largestBST(root);
        System.out.println(maxBST);
    }
}
