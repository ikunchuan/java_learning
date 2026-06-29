package leetcode;

import java.util.HashMap;

public class TwoNumSumMapDemo1 {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {

        // 定义一个map，用来存已经遍历过的数 key为数值，value为下标
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }else {
                map.put(nums[i],i);
            }
        }

        return null;
    }
}
