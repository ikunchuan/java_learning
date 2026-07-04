package leetcode;

public class BinaryTreeCountNodesDemo222 {
    public static void main(String[] args) {

    }

    public int countNodes(TreeNode root) {

        if (root == null) return 0;

        TreeNode leftNode = root.left;
        TreeNode rightNode = root.right;

        int leftLength = 0;
        int rightLength = 0;

        while (leftNode != null){
            leftNode = leftNode.left;
            leftLength++;
        }

        while (rightNode != null){
            rightNode = rightNode.right;
            rightLength++;
        }

        if (leftLength == rightLength){
            return (2<<leftLength) - 1;
        }

        leftLength = countNodes(root.left);
        rightLength = countNodes(root.right);
        return leftLength + rightLength + 1;
    }
}
