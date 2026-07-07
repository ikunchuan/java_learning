package leetcode;

public class MaxValue {
    public static void main(String[] args) {

        int[] arr1 = {3,1,5,6,10,7,2,9};
        int max = findMax(arr1,0,arr1.length-1);
        System.out.println(max);

    }

    public static int findMax(int[] arr, int l, int r){
        if(l == r) return arr[l];

        int leftMax = findMax(arr, l, (l+r)/2);
        int rightMax = findMax(arr,(l+r)/2 + 1, r);

        return Math.max(leftMax,rightMax);

    }


}
