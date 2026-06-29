package io;

import java.io.FileWriter;
import java.io.IOException;

public class WriterDemo3 {
    public static void main(String[] args) {
//        FileWriter fileWriter = null;
//        try {
//            fileWriter = new FileWriter("io//demo2.txt",true);
//            fileWriter.write("hh\nhhh");
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            try {
//                fileWriter.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }

        //try-with-resource
        try (
            FileWriter fw = new FileWriter("io/demo2.txt")
            // 注意这里只能放资源对象
            // 什么是资源，资源都实现了AutoCloseable
        ){
            fw.write("I love you");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
