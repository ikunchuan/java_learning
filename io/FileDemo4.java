package io;

import java.io.File;

public class FileDemo4 {
    public static void main(String[] args) {
        // 遍历文件夹

        // 获取当前文件夹目录下的一级文件名称
        File f1 = new File("../java_learning");
        System.out.println(f1.exists());
        String[] list = f1.list();
        for (String dirString : list) {
            System.out.println(dirString);
        }
        System.out.println("--------------");

        // 获取当前目录下所有的“一级文件对象”到一个文件对象数组
        File f2 = new File("../java_learning");
        System.out.println(f2.exists());
        File[] files = f2.listFiles();
        for (File file : files) {
            System.out.print(file.getName() + "----" );
            System.out.println(file.length());
        }

    }
}
