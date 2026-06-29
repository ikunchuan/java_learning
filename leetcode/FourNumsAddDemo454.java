package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FourNumsAddDemo454 {
    public static void main(String[] args) {

    }

    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        // nums1和nums2的和放到一个map里面，key为值，value为次数
        for (int i : nums1) {
            for (int i1 : nums2) {
                int preparedNum = i+i1;
                // key（这里的key就是preparedNum）如果不存在，就设置为1，如果存在就++
                map.compute(preparedNum, (k, v) -> v == null ? 1 : v + 1);
                // 不同的写法
                // map.merge(preparedNum, 1, Integer::sum);
            }
        }

        for (int i : nums3) {
            for (int i1 : nums4) {
                int target = -(i + i1);
                if(map.containsKey(target)) count+=map.get(target);
                // 不同的写法 都是语法层面
                // count += map.getOrDefault(target, 0);
            }
        }

        return count;
    }
}
