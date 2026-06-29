package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        // 1.创建一个字节输出流管道与目标文件联通
        OutputStream os = new FileOutputStream("io/demo3.txt");     // 把原来的文件覆盖
        OutputStream os2 = new FileOutputStream("io/demo4.txt", true);      // 追加
        //2. 开始写字节数组出去
        os2.write(97);
        os2.write('b');

        byte[] bytes = "我爱你".getBytes();        // getBytes获取字节
        os2.write(bytes);

        // 换行符
        os2.write("\r\n".getBytes());

        os2.close();
    }

}
