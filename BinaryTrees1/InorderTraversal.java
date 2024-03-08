package BinaryTrees1;

public class InorderTraversal {

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

    public static class Binarytree{
        
        static int idx = -1;
        public Node builtTree(int[] nodes){ // can be static
            idx++;
            
            // if (idx == nodes.length || nodes[idx] == -1) {
            //     return null;
            // }

            if(nodes[idx] == -1){
                return null;
            }
            
            Node newNode = new Node(nodes[idx]);
            newNode.left = builtTree(nodes);
            newNode.right = builtTree(nodes);

            return newNode;
        }
    }

    public static void inorderTraversal(Node root){  //O(n)
        if(root == null){
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.data+" ");
        inorderTraversal(root.right);
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        Binarytree bt = new Binarytree();
        Node root = bt.builtTree(arr);
        System.out.println(root.data);
        inorderTraversal(root);
        


    }
}
