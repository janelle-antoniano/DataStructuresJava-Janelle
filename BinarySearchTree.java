class TreeNode {
    int data;
    TreeNode left, right;
    public TreeNode(int item) {
        data = item;
        left = right = null;
    }
}

public class BinarySearchTree {
    TreeNode root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private TreeNode insertRec(TreeNode root, int data) {
        if (root == null) return new TreeNode(data);
        if (data < root.data) root.left = insertRec(root.left, data);
        else root.right = insertRec(root.right, data);
        return root;
    }

    public void inorder(TreeNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.inorder(bst.root);
    }
}
