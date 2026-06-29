package leetcode;

import java.util.ArrayList;

public class LongNumDemo1 {

    public static void main(String[] args) {
        String add1 = MyBgNumFun.add("7234", "16234");
        String mul1 = MyBgNumFun.mul("23333","122222234");
        System.out.println(add1);
        System.out.println(mul1);
    }



}

class MyBgNumFun{

    // 存两个超大的数进来 相加
    public static String add(String s1, String s2){
        String longString;
        String shortString;
        if (s1.length()>=s2.length()) {
            longString = s1;
            shortString = s2;
        } else {
            longString = s2;
            shortString = s1;
        }


        // 用来存放结果
        ArrayList<Integer> arrayList = new ArrayList<>();


        int shortLength = shortString.length();
        int longLength = longString.length();

        // 变成数组
        char[] longStringCharArray = longString.toCharArray();
        char[] shortStringCharArray = shortString.toCharArray();

        ArrayList<Character> shortStringCharArrayEntire = new ArrayList<>();

        for (char c : shortStringCharArray) {
            shortStringCharArrayEntire.add(c);
        }
        for (int i = 0; i < longLength - shortLength; i++) {
            shortStringCharArrayEntire.add(0,'0');
        }

        int flag = 0;

        for (int i = 0; i < longLength; i++) {

            int num1 = longStringCharArray[longLength-1-i] - '0';
            int num2 = shortStringCharArrayEntire.get(longLength-1-i) - '0';

            int addResult = num1 + num2 + flag;
            if (addResult >= 10)
                flag = 1;
            else flag = 0;
            arrayList.add(0, addResult%10);
        }

        if (flag == 1)
            arrayList.add(0,1);

        StringBuilder stringBuilder = new StringBuilder();
        for (Integer i : arrayList) {
            stringBuilder.append(i);
        }

        return stringBuilder.toString();
    }

    // 相乘
    public static String mul(String s1, String s2){
        String num;
        int count;
        if (s1.length() >= s2.length()){
            num = s1;
            count = Integer.parseInt(s2);
        }else {
            num = s2;
            count = Integer.parseInt(s1);
        }
        String resultNum = num;

        for (int i = 0; i < count-1; i++) {
            resultNum = add(resultNum, num);
        }

        return resultNum;
    }
}