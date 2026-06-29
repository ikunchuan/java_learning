package leetcode;

public class InvertBinaryTreeDemo226 {
    public static void main(String[] args) {

    }

    public TreeNode invertTree(TreeNode root) {

        traversal(root);

        return root;
    }

    public void traversal(TreeNode node){

        if(node == null) return;

        if (node.left == null && node.right == null) return;

//        try {
//            if (node.left == null && node.right == null) return;
//        } catch (Exception e) {
//            return;
//        }
        TreeNode temp = new TreeNode();
        temp = node.right;
        node.right = node.left;
        node.left = temp;

        traversal(node.left);
        traversal(node.right);

    }
}
