package com.alex.file_;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class creatFile01 {
    public static void main(String[] args) {

    }

    @Test
    public void creatMethod01(){
        String pathName="d:\\hello.txt";
        File file = new File(pathName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally{
            System.out.println("结束");
        }
    }
    @Test
    public void createMethod02(){
        String parentName="d:\\";
        String childNmae="hello2.txt";
        File parentFile = new File(parentName);
        File file = new File(parentFile, childNmae);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally{
            System.out.println("结束");
        }
    } @Test
    public void createMethod03(){
        String parentName="d:\\";
        String childNmae="hello3.txt";

        File file = new File(parentName, childNmae);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally{
            System.out.println("结束");
        }
    }
}
