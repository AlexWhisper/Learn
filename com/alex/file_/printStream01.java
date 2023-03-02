package com.alex.file_;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class printStream01 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = System.out;
        ps.println("hello");

        System.setOut(new PrintStream("D:\\hello.txt"));
        System.out.println("今天学习了javaio流");

    }
}
