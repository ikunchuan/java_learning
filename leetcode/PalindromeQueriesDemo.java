package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class PalindromeQueriesDemo {
    public static void main(String[] args) {

    }

    // 给出一个数组，判断在指定数组里面能不能变成回文串
    public static boolean isPalindromeAddArr(int[] arr){

        return false;
    }


    // 判断在操作之后是否能变成回文串
    public static boolean isAfterChangePalindrome(String s){
        int middle = s.length()/2-1;
        String stringLeft = s.substring(0,middle+1);
        String stringRight = s.substring(middle+1);

        return isArrEqual(stringLeft,stringRight);
    }


    // 判断是否为回文字符串
    public static boolean isPalindrome(String s){
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i))
                return false;
        }
        return true;
    }


    // 判断两个字符串里面的元素是否相等
    public static boolean isArrEqual(String s1, String s2){
        char[] charArrayLeft = s1.toCharArray();
        char[] charArrayRight = s2.toCharArray();
        // 复制数组，保存数据
        char[] copy1 = charArrayLeft.clone();
        char[] copy2 = charArrayRight.clone();
        Arrays.sort(copy1);
        Arrays.sort(copy2);

        return Arrays.equals(copy1,copy2);
    }

}

