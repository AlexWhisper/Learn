package com.alex.file_;

import java.io.*;

public class fileReader01 {
    public static void main(String[] args) {
        String path="D:\\hello.txt";
        String path2="D:\\hello2.txt";
        File file = new File(path);
        File file2 = new File(path2);
        FileReader fileReader =null;
        FileWriter fileWriter  =   null;

        int read=0;
        try {
           fileReader = new FileReader(file);
              fileWriter = new FileWriter(file2,true);
                fileWriter.write("你好啊，这里是追加内容");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileReader.close();
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
