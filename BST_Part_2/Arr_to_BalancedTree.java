package BST_Part_2;

public class Arr_to_BalancedTree {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static Node toBalancedTree(int[] arr, int si, int ei) {
        if (si > ei) {
            return null;
        }
        int mid = (si + ei) / 2;
        Node root = new Node(arr[mid]);

        root.left = toBalancedTree(arr, si, mid - 1);
        root.right = toBalancedTree(arr, mid + 1, ei);
        return root;
    }

    public static void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        Node root = toBalancedTree(arr, 0, arr.length - 1);
        preOrderTraversal(root);
    }
}
