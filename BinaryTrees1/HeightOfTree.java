package BinaryTrees1;

public class HeightOfTree {

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


    public int count(Node root){
        if(root == null){
            return 0;
        }
        int leftCount = count(root.left);
        int rightCount = count(root.right);

        return leftCount+rightCount+1;

    }
    public int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;

    }

}

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt = new BinaryTree();
        Node root = bt.builtTree(nodes);
        System.out.println("The root of the tree is : "+root.data);
        int h = bt.height(root);
        System.out.println("The height of tht tree is : "+h);
        int c = bt.count(root);
        System.out.println("The number of nodes in the tree is : "+c);
        int sum = bt.sumOfNodes(root); 
        System.out.println("The sum of nodes of the tree is : "+sum);
        
    }
}
