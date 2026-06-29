package io;

import java.io.*;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        // 创建文件字节输入流管道，与原管道接通
//        InputStream is = new FileInputStream("io/demo1.txt");

        // 开始读取文件的字节数据
//        int read = is.read();       // 每次读取一个字节
//        System.out.println((char) read);
//
//        int read2 = is.read();
//        System.out.println((char) read2);
//
//        int read3 = is.read();
//        System.out.println(read3);

        // 使用循环改造
//        int b;
//        while ((b = is.read()) != -1){
//            System.out.print((char) b);
//        }
//
//        is.close();

        System.out.println("--------");

        // 每次读取多个字节
        // 1.创建一个字节输入流对象，代表总结输入流管道与源文件接通
//        InputStream is = new FileInputStream("io/demo2.txt");

        // 2.开始读取文件中的字节数据，每次读取多个字节
//        byte[] bytes = new byte[3];
//        int len = is.read(bytes);
//        String rs = new String(bytes);
//        System.out.println(rs);
//        System.out.println(len);
//
//        int len2 = is.read(bytes);
//        String rs2 = new String(bytes);
//        System.out.println(rs2);
//        System.out.println(len2);

        // 3.使用循环
//        byte[] buffer = new byte[3];
//        int len;
//        while ((len = is.read(buffer)) != -1){
//            String rs = new String(buffer,0,len);
//            System.out.print(rs);
//        }

        // 4.一次读完
        // 创建一个字节流管道与源文件相通
        InputStream is = new FileInputStream("io/demo2.txt");

        // 准备一个字节数组，大小与文件的大小一样
        File f = new File("io/demo2.txt");
        long size = f.length();
        byte[] buffer = new byte[(int) size];

        int len = is.read(buffer);
        System.out.println(new String(buffer));

        System.out.println(size);
        System.out.println(len);

    }
}
