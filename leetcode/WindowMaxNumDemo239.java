package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class WindowMaxNumDemo239 {
    public static void main(String[] args) {

    }

    public int[] maxSlidingWindow(int[] nums, int k) {

        int[] a = new int[nums.length-k+1];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(nums[0]);
        queue.add(nums[1]);

        int max = 0;

        if (nums[0] > nums[1]){
            max = nums[0];
        }else {
            max = nums[1];
        }

        for (int i = 2; i < nums.length; i++) {
            queue.add(nums[i]);
            if (nums[i] > max){
                nums[i] = max;
            }
            a[i-2] = max;

            queue.poll();
        }

        return a;
    }
}
