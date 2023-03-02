package com.alex.file_;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileOutputSteam {
    public static void main(String[] args) {
        String path="D:\\hello2.txt";
        File file = new File(path);

        FileOutputStream fileOutputStream =null;

        char data='W';

        String datas="大家好我是Alex";
        byte[] bytes = datas.getBytes();


        try {
            fileOutputStream = new FileOutputStream(file);
//            fileOutputStream.write(data);
            fileOutputStream.write(bytes);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


