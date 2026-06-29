package leetcode;

public class ZhiShuDemo1 {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1,7};
        int result = maximumPrimeDifference(arr1);
        System.out.println(result);
    }

    public static int maximumPrimeDifference(int[] nums) {
        int left = 0;
        int right = nums.length - 1;


        while (isZhiShu(nums[left]) == false && left < right) {
            left++;
        }
        System.out.println(left);

        while (isZhiShu(nums[right]) == false && left < right) {
            right--;
        }
        System.out.println(right);



        return right-left;

    }

    public static boolean isZhiShu(int num){
        if(num == 1) return false;
        if(num == 2) return true;
        for(int i = num-1; i > 1; i--){
            if((num % i) == 0)
                return false;
        }
        return true;
    }
}
