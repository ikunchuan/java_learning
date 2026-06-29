package io;

import java.io.FileWriter;
import java.io.IOException;

public class WriterDemo1 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("io//demo1.txt");
        fileWriter.write("abcde ");

        // 刷新缓冲区，将数据刷到目的地中      flash刷新后流可以继续使用，close刷新后，会将流关闭
        fileWriter.flush();

        fileWriter.write("hello world");

        // 关闭流资源，关闭之前会刷新缓冲区的数据
        fileWriter.close();
    }
}
