package com.alex.file_;

import java.io.*;

public class fileCopy01 {
    public static void main(String[] args) {
        String path="D:\\bg.jpg";
        String path2="D:\\bg2.jpg";
        File file = new File(path);
        File file2 = new File(path2);
        FileInputStream fileInputStream =null;
        FileOutputStream fileOutputStream = null;
        int data=0;

        try {
            fileInputStream = new FileInputStream(file);
            fileOutputStream = new FileOutputStream(file2);
            while((data=fileInputStream.read())!=-1){
                fileOutputStream.write(data);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally
        {
            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
