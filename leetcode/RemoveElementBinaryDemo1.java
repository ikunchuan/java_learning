package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedMap;

public class RemoveElementBinaryDemo1 {

    public static void main(String[] args) {
        int[] arr = new int[]{3,2,2,3};
        int i = removeElement(arr, 2);
        System.out.println(i);

    }

    public static int removeElement(int[] nums, int val){
//        ArrayList<Integer> arrayList = new ArrayList<>();


        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[count++] = nums[i];
            }
        }
        for(int element : nums){
            System.out.print(element);
        }
        return count;

    }

}
