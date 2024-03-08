package BinaryTrees2;
import BinaryTrees2.Diameter.BinaryTree;
import BinaryTrees2.Diameter.Node;

public class subTree {

    public static boolean isSubtree(Node root,Node subRoot){
        if(root==null)
        {
            return false;
        }
        if(root.data == subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        // agar left ya right khi bhi exist krta hai to koi na koi true return krega
        boolean left = isSubtree(root.left, subRoot);
        boolean right = isSubtree(root.right, subRoot);
        return (left || right);
    }
    public static boolean isIdentical(Node root,Node subRoot){
        // when both root and subRoot reaches on leaf
        if(root==null && subRoot==null){
            return true;
        }
        // when root become nulll but still have element in subroot
        else if(root==null||subRoot==null||root.data!=subRoot.data){
            return false;
        }
        if(!isIdentical(root.left, subRoot.left)){
            return false;
        }
        if(!isIdentical(root.right, subRoot.right)){
            return false;
        }


        return true;
    }
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt = new BinaryTree();
        Node root = bt.builtTree(nodes);
        System.out.println("The root of the tree is : "+root.data);
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);
        subRoot.left.left = new Node(7);
        System.out.println("The root of the subtree is : "+subRoot.data);
        System.out.println(isSubtree(root,subRoot));

        
    }
}
