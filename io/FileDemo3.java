package io;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("io/demo3.txt");

        // 创建文件
        System.out.println(f1.createNewFile());

        // 创建文件夹
        File f2 = new File("io/test");
        System.out.println(f2.mkdir());

        // 创建多级文件夹
        File f3 = new File("io/test/aaa/bbb");
        System.out.println(f3.mkdirs());

        // 删除文件，不能删除非空文件夹
        System.out.println(f1.delete());


    }

}
