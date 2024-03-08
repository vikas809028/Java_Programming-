package BinaryTrees2;

public class Diameter {

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

    public static Node left = null;
    public static Node right = null;

    public static class BinaryTree{

        static int idx = -1;

        public Node builtTree(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]); 
            newNode.left = builtTree(nodes);
            newNode.right = builtTree(nodes);

            return newNode;
        }

        public int height(Node root){
            if(root == null){
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);

            return Math.max(lh,rh)+1;

        }

        public int diameter(Node root){
            if(root == null){
                return 0;
            }
            int ldiam = diameter(root.left);
            int rdiam = diameter(root.right);
            int lh = height(root.left);
            int rh = height(root.right);

            int selfDia = lh+rh+1;

            return Math.max(selfDia,Math.max(ldiam,rdiam));

        }
}

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,6,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt = new BinaryTree();
        Node root = bt.builtTree(nodes);
        int d = bt.diameter(root);
        System.out.println("The diameter of the tree is : "+d);
        
    }
}
