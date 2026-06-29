package leetcode;

import leetcode.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversalDemo144 {


    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        traversal(root,list);

        return list;
    }

    public void traversal(TreeNode node, List<Integer> list){
        if(node == null) return;
        list.add(node.val);
        traversal(node.left,list);
        traversal(node.right,list);
    }

}

