package io;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class CharsetDemo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 1.编码
        String s = "a我b";
        byte[] bytes = s.getBytes();
        for (byte aByte : bytes) {
            System.out.println(aByte);
        }

        byte[] bytes1 = s.getBytes("gbk");
        System.out.println(Arrays.toString(bytes1));

        // 2.解码
        String s1 = new String(bytes);      // 按照平台默认编码（UTF-8）解码
        System.out.println(s1);
        String s2 = new String(bytes1);
        System.out.println(s2);             // 按utf8来解码gbk的编码
        String s3 = new String(bytes1,"gbk");
        System.out.println(s3);             // 按gbk来解码gbk的编码

    }
}
