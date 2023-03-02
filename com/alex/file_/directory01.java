package com.alex.file_;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class directory01 {
    public static void main(String[] args) {
        String path1="d:\\news1.txt";
        File file = new File(path1);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (file.exists()){
            System.out.println("文件存在正在删除");
            file.delete();
            System.out.println("文件删除成功");
        }else {
            System.out.println("文件不存在");
        }

        String pathName="D:\\demo\\a\\b\\c";
        File file1 = new File(pathName);

        if (file1.exists()) {
            System.out.println("目录存在");

        }else
        {
            System.out.println("目录不存在");
            file1.mkdirs();
            System.out.println("文件创建成功");
        }
    }



}
