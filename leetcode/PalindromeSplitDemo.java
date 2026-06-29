package leetcode;

import java.util.List;

public class PalindromeSplitDemo {

    public static void main(String[] args) {

        String s = "g";
        boolean palindrome = isPalindrome(s);
        System.out.println(palindrome);

    }

    // 最终
    public List<List<String>> partition(String s) {
        int length = s.length();
        for (int i = 0; i < length; i++) {
            // 每一个子串
            String substring = s.substring(0, i);

        }


        return null;
    }


    // 现在这个字符串（包含最后一个字符）和前面的能不能
    public static void split(String s){

    }


    // 判断是否为回文串
    public static boolean isPalindrome(String string){
        int count = string.length() / 2;
        for (int i = 0; i <= count; i++) {
            if(string.charAt(i) != string.charAt(string.length()-1-i)){
                return false;
            }
        }
        return true;
    }

}
