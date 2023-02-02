package com.alex.test;

public class Homework04 {
    public static void main(String[] args) {
        int[] Arr={11,22,33,44,55,66};
        int[] res;
        A03 a=new A03();
        res=a.copyArr(Arr);
        for (int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
}

class A03{

    public int[] copyArr(int[] Arr){
        int res[]=new int[Arr.length];
        for (int i=0;i<Arr.length;i++){
            res[i]=Arr[i];
        }
        return res;
    }
}