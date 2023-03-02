package com.alex.file_;

import java.io.File;

public class fileInfo01 {
    public static void main(String[] args) {
        String Path="D:\\hello.txt";
        File file = new File(Path);
        System.out.println(file.getName());

        System.out.println(file.getAbsolutePath());

        String parent = file.getParent();
        System.out.println(parent);

        System.out.println(file.length());

        System.out.println(file.exists());

        System.out.println(file.isDirectory());
    }

}
