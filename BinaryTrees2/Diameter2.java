package BinaryTrees2;
import BinaryTrees2.Diameter.BinaryTree;
import BinaryTrees2.Diameter.Node;

public class Diameter2 {

        public static class Info{
            int dia;
            int ht;
            Info(int dia,int ht){
                this.dia = dia;
                this.ht = ht;
            }
        }

        public static Info diameter(Node root){
           if(root == null){
            return new Info(0, 0);
           }
           Info leftInfo = diameter(root.left); 
           Info rightInfo = diameter(root.right);
           int dia = Math.max(Math.max(leftInfo.dia,rightInfo.dia),(leftInfo.ht+rightInfo.ht+1));
           int ht = Math.max(leftInfo.ht,rightInfo.ht)+1;

           return new Info(dia,ht);
           
           
        }


    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,6,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt = new BinaryTree();
        Node root = bt.builtTree(nodes);
        System.out.println("The diameter of the tree is : " + diameter(root).dia);
    }
}
