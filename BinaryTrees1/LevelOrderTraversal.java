package BinaryTrees1;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    public static class Node
    {
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

    public static class Binarytree
    {
        
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

    public static void LevelorderTraversal(Node root){ 
        //O(n)
        if(root == null){
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty()){

            Node currNode = q.remove();

            if(currNode == null){
                // jab bhi null aaye to new line
                System.out.println();
                // newline ke baad check kro if Empty then break
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data+" ");
                // check left it not null than add it to queue
                if(currNode.left!=null)
                q.add(currNode.left);
                if(currNode.right!=null)
                q.add(currNode.right);
            }

        }
    } 


    
    public static void main(String[] args) {
        int arr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree bt = new Binarytree();
        Node root = bt.builtTree(arr);
        LevelorderTraversal(root);
        
    }

}