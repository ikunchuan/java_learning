package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderDemo102 {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){

            int size = queue.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if (poll != null) {
                    if(poll.left != null)  queue.add(poll.left);

                }
                if (poll != null) {
                    if(poll.right != null) queue.add(poll.right);
                }
                if (poll != null) {
                    list.add(poll.val);
                }

            }

            result.add(list);

        }


        return result;
    }


}
