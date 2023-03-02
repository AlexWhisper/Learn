package com.alex.file_;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fileInputStream01 {
    public static void main(String[] args) {
        String path="D:\\hello.txt";
        File file = new File(path);
        int data=0;
        byte[] datas = new byte[1024];
        int len=0;
        FileInputStream fileInputStream =null;

        try {
            fileInputStream = new FileInputStream(file);

            while((len= fileInputStream.read(datas))!=-1){
                System.out.println(new String(datas,0,len));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("使用结束关闭文件");
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }



}

