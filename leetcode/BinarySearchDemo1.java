package leetcode;

public class BinarySearchDemo1 {
    public static void main(String[] args) {

    }

    public static int binarySearch(int[] arr, int target){
        int left=0, right=arr.length-1;
        while (left <= right){
            int middle=(left+right)/2;
            if (arr[middle]>target) {
                right = middle-1;
            } else if (arr[middle] == target) {
                return middle;
            } else {
                left = middle+1;
            }
        }
        
        return -1;
    }
}
