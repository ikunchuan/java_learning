package leetcode;

import java.util.Scanner;

public class LongNumDemo2 {
    public static void main(String[] args) {
        String a = "2512";
        String b = "123";

        System.out.println(multiply(a, b));
    }

    public static String multiply(String num1, String num2) {
        // 如果有一个数为0，直接返回0
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int m = num1.length();
        int n = num2.length();

        // 将字符串转为整数数组，低位在前
        int[] arr1 = new int[m];
        int[] arr2 = new int[n];
        for (int i = 0; i < m; i++) {
            arr1[i] = num1.charAt(m - 1 - i) - '0';
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = num2.charAt(n - 1 - i) - '0';
        }

        // 乘积结果最多 m + n 位
        int[] result = new int[m + n];

        // 模拟乘法
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i + j] += arr1[i] * arr2[j];
                // 处理进位（这里先不处理，后面统一处理）
            }
        }

        // 统一处理进位
        int carry = 0;
        for (int i = 0; i < result.length; i++) {
            int sum = result[i] + carry;
            result[i] = sum % 10;
            carry = sum / 10;
        }

        // 将结果转为字符串（从高位到低位）
        StringBuilder sb = new StringBuilder();
        int i = result.length - 1;

        // 跳过前导零
        while (i >= 0 && result[i] == 0) {
            i--;
        }

        while (i >= 0) {
            sb.append(result[i]);
            i--;
        }

        return sb.toString();
    }
}