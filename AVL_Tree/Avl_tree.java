// package AVL_Tree;

// public class Avl_tree {
//     public static class Node{
//         int data,height;
//         Node left;
//         Node right;
//         Node(int data){
//             this.data = data;
//             height = 1; // one node is added hence its height become 1
//         }
//     }
//     // public static int getBalanceFactor(Node root){

//     // }
//     public static Node builtAvlTree(Node root,int key){
//         //  ----------------------basic bst--------------------------
//         if(root==null){
//             return new Node(key);
//         }
//         if(key<root.data){
//             root.left = builtAvlTree(root.left, key);
//         }
//         else if(key>root.data){
//             root.left = builtAvlTree(root.right, key);
//         }
//         else{
//             return root;
//         }
//         //------------------------AVl concept---------------------------------
//         root.height = 
//         // int bf = getBalanceFactor(root);

//     }
//     public static void main(String[] args) {
//         int[] nodes = {40,20,10,25,30,22,50};
//         Node root = null;
//         for(int i =0;i<nodes.length;i++){
//             root = builtAvlTree(root,nodes[i]);
//         }

//     }
// }
