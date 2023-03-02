package com.alex.file_;

import java.io.File;
import java.io.FileInputStream;

public class fileInputStream {
    public static void main(String[] args) {
        String path="D:\\hello.txt";
        File file = new File(path);
        int data=0;
        FileInputStream fileInputStream =null;

        try {
            fileInputStream = new FileInputStream(file);
            while((data=fileInputStream.read())!=-1){
                System.out.println((char) data);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
