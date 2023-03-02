package com.alex.file_;

import java.io.*;

public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\hello.txt");
        File file2 = new File("D:\\BufferWriterTest01.txt");
        FileReader fileReader = new FileReader(file);
        FileWriter fileWriter = new FileWriter(file2);

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        String s;
        while((s=bufferedReader.readLine())!=null){
            bufferedWriter.write(s);
            bufferedWriter.write("\n");
        }
        bufferedWriter.close();
        bufferedReader.close();

}
}
