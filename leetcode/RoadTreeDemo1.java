package leetcode;

import java.util.Arrays;

public class RoadTreeDemo1 {
    public static void main(String[] args) {

        int[][] arr2D = new int[][]{
                {2,4},
                {3,4},
                {2,6},
        };
        int i = fun2(8, arr2D);
        System.out.println(i);

    }

    public static int[] fun1(int a, int b, int[] arr){

        for (int i = a; i <= b; i++) {
            if(arr[i] == 0)
                arr[i] = 1;
        }

        return arr;
    }

    public static int fun2(int L,int[][] arr2D){
        int count = 0;
        int[] arr = new int[L+1];
        Arrays.fill(arr,0);
        for (int i = 0; i < arr2D.length; i++) {
            arr = fun1(arr2D[i][0],arr2D[i][1],arr);
        }
        for (int i : arr) {
            if(i == 0) count++;
        }
        return count;
    }

}
