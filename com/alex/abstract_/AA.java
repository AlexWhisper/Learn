package com.alex.abstract_;

public class AA {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        long num=0;
        for (long i=1;i<=800000;i++){
            num+=1;
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}

