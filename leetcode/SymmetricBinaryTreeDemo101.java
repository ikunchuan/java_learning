package leetcode;

public class SymmetricBinaryTreeDemo101 {
    public static void main(String[] args) {

    }

    public boolean isSymmetric(TreeNode root) {

        boolean result = traversal(root.left, root.right);

        return result;
    }

    public boolean traversal(TreeNode left, TreeNode right){

        if (left == null && right != null) return false;
        else if (left != null && right == null) return false;
        else if (left == null && right == null) return true;
        else if(left.val != right.val) return false;
        else {
            return traversal(left.left,right.right) && traversal(left.right,right.left);
        }
    }
}
