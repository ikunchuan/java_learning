package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo1 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("io//demo2.txt");
//        int read = fileReader.read();
//        System.out.println((char) read);

        int ch = 0;
        while ((ch = fileReader.read()) != -1){
            System.out.println((char) ch);
        }
    }
}
