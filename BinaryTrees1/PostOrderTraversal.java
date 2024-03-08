package BinaryTrees1;

public class PostOrderTraversal {
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

    public static void PostorderTraversal(Node root){  //O(n)
        if(root == null){
            return;
        }
        PostorderTraversal(root.left);
        PostorderTraversal(root.right);
        System.out.print(root.data+" ");
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree bt = new Binarytree();
        Node root = bt.builtTree(arr);
        System.out.println(root.data);
        PostorderTraversal(root);
        
    }
}
