package io;

import java.io.File;

public class FileDemo1 {

    public static void main(String[] args) {
        // 创建一个对象，代指某个具体的文件
        File f1 = new File("io/demo1.txt");

        System.out.println(f1.getName());
        System.out.println(f1.length());

        System.out.println("--------");

        // 文件夹
        File f2 = new File("io");
        System.out.println(f2.getName());
        System.out.println(f2.length());        // 这里的大小是文件夹自身的大小，不是文件夹里面所有文件的大小
    }

}
