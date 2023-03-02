package com.alex.file_;

import java.io.*;

public class inputStreamReader01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File("D:\\hello.txt"));
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"gbk"); //使用转换流，将字节流转为InputStreamReader时可以指定一个字符编码，然后再将InputStream对象传入BUfferedReader就不会出错了
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String s;
        while ((s=bufferedReader.readLine())!=null){
            System.out.println(s);
        }
        bufferedReader.close();


    }
}
