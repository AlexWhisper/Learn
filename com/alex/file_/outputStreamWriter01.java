package com.alex.file_;

import java.io.*;

public class outputStreamWriter01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(new File("D:\\hello23123213.txt"));
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream,"gbk");
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        bufferedWriter.write("你好");

        bufferedWriter.close();
    }
}
