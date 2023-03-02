package com.alex.file_;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class homework01 {
    public static void main(String[] args) {
        String myPath="D:\\myTemp";
        File file1 = new File(myPath + "\\hello.txt");
        File file = new File(myPath);
        BufferedWriter bufferedWriter = null;
        if(file.exists()&&file.isDirectory()){
            System.out.println("文件夹已经存在");
            if (file1.exists()&&file1.isFile()){
                System.out.println("文件已经存在");
            }
        }else {
            file.mkdir();
            System.out.println("文件夹创建成功");
            try {
                bufferedWriter =new BufferedWriter(new FileWriter(file1));
                bufferedWriter.write("hello world~");
                System.out.println("文件创建成功");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }finally{
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }



    }
}
