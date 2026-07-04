package leetcode;

public class BinaryTreeMinDepthDemo111 {
    public static void main(String[] args) {

    }

    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);

        if (root.left == null && root.right != null){
            return rightDepth+1;
        }
        if (root.left != null && root.right == null){
            return leftDepth+1;
        }
        int result = Math.min(leftDepth,rightDepth) + 1;
        return  result;

    }


}
