package io;

import java.io.File;

public class FileDemo6 {
    public static void main(String[] args) {


        File f1 = new File("io/test");
        allFile(f1);

    }

    public static void allFile(File f1){
        File[] files = f1.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                allFile(file);
            }
            System.out.print(file.getName()+"---");
            System.out.println(file.length());
        }


    }



    public static void recursion(File file){

        File[] files = file.listFiles();

    }

}
