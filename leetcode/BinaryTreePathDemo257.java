package leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePathDemo257 {
    public static void main(String[] args) {

    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if (root == null) return list;
        StringBuilder sb = new StringBuilder();
        traversal(root, sb, list);
        return list;
    }

    public void traversal(TreeNode node, StringBuilder sb, List<String> list) {
        // 记录当前节点的值
        int len = sb.length();  // 记录当前长度，用于回溯

        if (sb.length() == 0) {
            sb.append(node.val);
        } else {
            sb.append("->").append(node.val);
        }

        // 叶子节点：收集路径
        if (node.left == null && node.right == null) {
            list.add(sb.toString());
            // 回溯：删除当前节点和分隔符
            sb.delete(len, sb.length());
            return;
        }

        // 递归左右子树
        if (node.left != null) {
            traversal(node.left, sb, list);
        }
        if (node.right != null) {
            traversal(node.right, sb, list);
        }

        // 回溯：删除当前节点和分隔符
        sb.delete(len, sb.length());
    }
}
