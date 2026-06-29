package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MatrixSpiralDemo59 {
    public static void main(String[] args) {

        int[][] ints = generateMatrix(1);
        for (int[] anInt : ints) {
            for (int i : anInt) {
                System.out.print(i + " ");
            }
            System.out.println("\n");
        }

    }

    public static int[][] generateMatrix(int n){

        // 每次x从哪里开始
        int startX = 0;
        // 每次y从哪里开始
        int startY = 0;
        // 数据，从1到n的平方
        int num = 1;
        // 离边界的距离，每一次大循环之后+1
        int offset = 0;
        int[][] arr = new int[n][n];

        if (n == 1){
            arr[0][0] = 1;
            return arr;
        }

        for (int count = 0; count < n/2; count++) {

            // 从左到右
            for (int y = offset; y < n-1-offset; y++) {
                arr[startX][y] = num++;
                startY = y+1;
            }

            // 从上到下
            for (int x = offset; x < n-1 - offset; x++) {
                arr[x][startY] = num++;
                startX = x+1;
            }

            // 从右到左
            for (int y = n-1-offset; y > offset; y--) {
                arr[startX][y] = num++;
                startY = y-1;
            }

            // 从下到上
            for (int x = n-1-offset; x > offset; x--) {
                arr[x][startY] = num++;
            }

            startX = ++offset;


            if(n%2 != 0){
                arr[n/2][n/2] = n*n;
            }

        }
        return arr;
    }

    // 左到右
    public static void leftToRight(int startX, int startY, int offset, int[][] arr, int num){          // a是行(固定)，b是列
        int finalLoc = 0;
        for (int y = 0; y < arr.length-offset; y++) {
            arr[startX][y] = num++;
            finalLoc = y;
        }
    }

    // 上到下
    public static void upToDown(int startX, int startY, int offset, int[][] arr, int num){             // a是行，b是列(固定)
        for (int x = 0; x < arr.length - offset; x++) {
            arr[x][startY] = num++;
        }
        startX =  arr.length-offset;
    }

    // 右到左
    public static void rightToLeft(int startX, int startY, int offset, int[][] arr, int num){          // a是行(固定)，b是列
        for (int y = arr.length-offset; y > offset; y--) {
            arr[startX][y] = num++;
        }
        startY = offset;
    }

    // 下到上
    public static void downToUp(int startX, int startY, int offset, int[][] arr, int num){             // a是行，b是列(固定)
        for (int x = arr.length-offset; x < offset; x++) {
            arr[x][startY] = num++;
        }
    }
}
