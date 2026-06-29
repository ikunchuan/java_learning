package io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo1 {
    public static void main(String[] args) {
        // 字符输出流写数据之后，必须要刷新流，或者关闭流，数据才能生效
        try(FileWriter fw = new FileWriter("io/demo6.txt")) {
            fw.write('a');
            fw.write(97);
            fw.write('我');
            fw.write("\r\n");
            fw.write("我爱你");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
