package io;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileDemo2 {
    public static void main(String[] args) {
        File f1 = new File("io/demo2.txt");

        // 当前文件对象，对应的路径是否存在
        System.out.println(f1.exists());

        // 当前文件对象是不是文件
        System.out.println(f1.isFile());

        // 当前文件对象是不是文件夹
        System.out.println(f1.isDirectory());

        // 最后修改时间
        long time = f1.lastModified();
        System.out.println(time);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(time));

        // getPath，获取创建文件对象时，使用的路径
        File f2 = new File("io/demo1.txt");
        File f3 = new File("/Users/ikunchuan/Desktop/java_learning/io/demo2.txt");
        System.out.println(f2.getPath());
        System.out.println(f3.getPath());

        // 得到绝对路径
        String absolutePath = f2.getAbsolutePath();
        System.out.println(absolutePath);

    }
}
