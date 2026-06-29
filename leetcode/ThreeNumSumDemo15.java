package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumSumDemo15 {
    public static void main(String[] args) {

        int[] nums = {1,3,5,1,-1,-3,-4,-2,6,0,0,-4,-4,-4};

        ThreeNumSumDemo15 threeNumSumDemo15 = new ThreeNumSumDemo15();
        List<List<Integer>> lists = threeNumSumDemo15.threeSum(nums);

        System.out.println(lists);

    }

    public List<List<Integer>> threeSum(int[] nums) {

        // 结果数组
        List<List<Integer>> result = new ArrayList<>();

        // 先把数组排序好
        int[] array = Arrays.stream(nums).toArray();
        Arrays.sort(array);

        int length = array.length;

        // 从第一个数开始
        for (int i = 0; i < length-2; i++) {

            if(i > 0 && array[i]==array[i-1]){
                continue;
            };

            // 定义左右指针
            int left = i + 1;
            int right = length-1;

            while (left < right) {

                if (array[i] + array[left] + array[right] < 0) {
                    left++;
                } else if (array[i] + array[left] + array[right] == 0) {
                    List<Integer> integers = Arrays.asList(array[i], array[left], array[right]);
                    result.add(integers);
                    while(left < right && array[left] == array[left+1]){
                        left++;
                    }
                    while(left < right && array[right] == array[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                } else {
                    right--;
                }
            }

        }


        return result;
    }
}
