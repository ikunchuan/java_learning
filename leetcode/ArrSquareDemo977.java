package leetcode;

public class ArrSquareDemo977 {
    public static void main(String[] args) {

    }

    public static int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int[] arrNew = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i]*nums[i];
        }
        for (int i = nums.length-1; i >= 0; i--) {
            if (nums[left] >= nums[right]){
                arrNew[i] = nums[left++];
            }else {
                arrNew[i] = nums[right--];
            }
        }
        return arrNew;
    }
}
