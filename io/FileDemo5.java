package io;

import java.io.File;

public class FileDemo5 {
    public static void main(String[] args) {
        File f1 = new File("io/test/aaa/bbb");

        File[] files = f1.listFiles();

        for (File file : files) {
            String fileName = file.getName();
            String part1 = fileName.substring(0, 4);
            String part2 = fileName.substring(4, 5);
            String part3 = fileName.substring(5);
            String newName = part1 + (Integer.valueOf(part2)+20) + part3;
            file.renameTo(new File(f1,newName));
        }
    }

    // 遍历文件夹下面的多级文件

}
