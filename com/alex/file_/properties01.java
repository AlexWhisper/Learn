package com.alex.file_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class properties01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\mysql.properties"));
        String s;
        while((s=bufferedReader.readLine())!=null){

            String[] strs = s.split("=");//使用=号将字符串进行分割


            System.out.println("key是"+strs[0]+" value是"+strs[1]);
        }
    }
}
