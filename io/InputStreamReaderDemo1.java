package io;

import java.io.*;

public class InputStreamReaderDemo1 {
    public static void main(String[] args) {
        // 变成字节流
        try(FileInputStream fi = new FileInputStream("io/demo6.txt");
            // 把原始的字节流按照制定的字符集编码转换成字节输入流
            Reader gbk = new InputStreamReader(fi, "UTF8");
            // 包装成buffer
            BufferedReader buffer = new BufferedReader(gbk);
        ) {

            String line;
            while ((line = buffer.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
