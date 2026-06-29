package io;

import java.io.*;

public class FileCopyDemo1 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("io/demo4.txt");
        OutputStream os = new FileOutputStream("io/dmeo5.txt");

        byte[] buffer = is.readAllBytes();
        os.write(buffer);

        is.close();
        os.close();
    }
}
