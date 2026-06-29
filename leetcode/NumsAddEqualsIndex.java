package leetcode;

public class NumsAddEqualsIndex {

    public static void main(String[] args) {



    }

    public static int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i == numAdd(nums[i])) return i;
        }
        return -1;
    }

    public static int numAdd(int num){
        int count = 0;
        while (num > 0){
            count += num % 10;
            num /= 10;
        }
        return count;
    }

}
