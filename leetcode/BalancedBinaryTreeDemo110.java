package leetcode;

public class BalancedBinaryTreeDemo110 {
    public static void main(String[] args) {

    }

    public boolean isBalanced(TreeNode root) {

        int height = getHeight(root);
        return height != -1;
    }

    public int getHeight(TreeNode node){

        if (node == null) return 0;

        int leftHeight = getHeight(node.left);
        if(leftHeight == -1) return -1;
        int rightHeight = getHeight(node.right);
        if(rightHeight == -1) return -1;

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return Math.max(leftHeight,rightHeight) + 1;
    }
}
