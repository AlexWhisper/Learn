package com.alex.file_;

import java.io.*;

public class fileCopy02 {
    public static void main(String[] args) {
        String path="D:\\bg.jpg";
        String path2="D:\\bg2.jpg";
        File file = new File(path);
        File file2 = new File(path2);
        FileInputStream fileInputStream =null;
        FileOutputStream fileOutputStream = null;

        //使用字节数组拷贝文件
        byte[] datas= new byte[1024];
        int len=0;

        try {
            fileInputStream=new FileInputStream(file);
            fileOutputStream=new FileOutputStream(file2);

            while((len=fileInputStream.read(datas))!=-1){
                fileOutputStream.write(datas,0,len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
