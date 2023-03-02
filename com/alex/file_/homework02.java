package com.alex.file_;

import java.io.*;

public class homework02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=null;
        BufferedWriter bw=null;
        String s;

        try {
            br=new BufferedReader(new FileReader(new File("D:\\hello.txt")));
            bw=new BufferedWriter(new FileWriter(new File("D:\\hello1.txt")));
            while((s=br.readLine())!=null){
                System.out.println(s+",");
                bw.write(s+","+"\n");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {

            br.close();
            bw.close();

        }
        new File("D:\\hello.txt").delete();
        new File("D:\\hello1.txt").renameTo(new File("D:\\hello.txt"));
    }
}
