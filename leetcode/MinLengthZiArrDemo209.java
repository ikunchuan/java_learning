package leetcode;

import java.util.Arrays;

public class MinLengthZiArrDemo209 {
    public static void main(String[] args) {

        int[] arr = new int[]{2,3,1,2,4,3};
        int i = minSubArrayLen(7, arr);
        System.out.println(i);

    }

    // 暴力解法
    public static int minSubArrayLenBaoli(int target, int[] nums) {
        for (int i = 1; i <= nums.length; i++) {     // i是窗口的长度
            for (int j = 0; j <= nums.length-i; j++){
                int[] arrForAdd = Arrays.copyOfRange(nums, j, j+i);
                int count = Arrays.stream(arrForAdd).sum();
                if (count >= target)
                    return i;
            }
        }
        return 0;
    }
    // 高级滑动窗口
    public static int minSubArrayLen(int target, int[] nums){
        int result = Integer.MAX_VALUE;     // 长度，默认为max
        int sum = 0;
        for (int right = 0,left = 0; right < nums.length; right++) {     // right先动

            sum += nums[right];
            while (sum>=target){
                result = Integer.min(result, right - left + 1);
                sum -= nums[left++];
                if(sum>=target){
                    result = Integer.min(result, right - left + 1);
                }

            }
        }
        return result==Integer.MAX_VALUE?0:result;
    }

}
