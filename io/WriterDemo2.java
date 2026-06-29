package io;

import java.io.FileWriter;
import java.io.IOException;

public class WriterDemo2 {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("k://demo2.txt");
            fileWriter.write("hello");

        } catch (IOException e) {
            System.out.println(e.toString());
        } finally {
            try {
                if (fileWriter!=null)
                   fileWriter.close();
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }
    }
}
