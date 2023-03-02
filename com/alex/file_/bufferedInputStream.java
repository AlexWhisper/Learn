package com.alex.file_;

import java.io.*;

public class bufferedInputStream {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(new File("D:\\bg.jpg")));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File("D:\\bggggg.jpg")));

        byte[] b = new byte[1024];
        int read=0;

        try {
            while((read = bufferedInputStream.read(b))!=-1){
                bufferedOutputStream.write(b,0,read);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

            try {
                bufferedOutputStream.close();
                bufferedInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
