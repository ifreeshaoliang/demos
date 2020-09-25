import java.util.Scanner;

/**
 * @author ifree
 * @version 1.0
 * @description: TODO
 * @date 2020/9/21 19:54
 */
class TreeNode {
    int val;
    TreeNode leftChild;
    TreeNode rightChild;
    TreeNode(int x){
        val = x;
        leftChild = null;
        rightChild = null;
    }
}

class Tree {
    TreeNode root;
    Tree(){
        root = null;
    }
    boolean insertTreeNode(int data){
        TreeNode newNode = new TreeNode(data);
        if (root == null) {
            root = newNode;
            return true;
        }
        else {
            TreeNode currentNode = root;
            while ( currentNode != null ) {
                if (currentNode.val > data) {
                    if (currentNode.leftChild != null) {
                        currentNode = currentNode.leftChild;
                    }
                    else {
                        currentNode.leftChild = newNode;
                        return true;
                    }
                }
                else {
                    if (currentNode.rightChild != null) {
                        currentNode = currentNode.rightChild;
                    }
                    else {
                        currentNode.rightChild = newNode;
                        return true;
                    }
                }
            }
            return false;
        }
    }
    void preOrder(TreeNode root) {
        if (root == null)
            return;
        System.out.print(root.val + " ");
        preOrder(root.leftChild);
        preOrder(root.rightChild);
    }
    void inOrder(TreeNode root) {
        if (root == null)
            return;
        inOrder(root.leftChild);
        System.out.print(root.val + " ");
        inOrder(root.rightChild);
    }
    void postOrder(TreeNode root) {
        if (root == null)
            return;
        postOrder(root.leftChild);
        postOrder(root.rightChild);
        System.out.print(root.val + " ");
    }
}

public class TreeDemo {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Scanner in = new Scanner(System.in);
        int data;
        while ( in.hasNextInt() ) {
            data = in.nextInt();
            tree.insertTreeNode(data);
        }
        tree.preOrder(tree.root);
        System.out.println();
        tree.inOrder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);
        System.out.println();
    }
}
