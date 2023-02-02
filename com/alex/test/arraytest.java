package com.alex.test;

public class arraytest {
    public static void main(String[] args) {
        char[] array1=new char[26];
        for (int i=0;i<26;i++){
            array1[i]=(char)('A'+ i);
        }
        for (int i=0;i<26;i++){
            System.out.println(array1[i]+" ");
        }
    }
}



