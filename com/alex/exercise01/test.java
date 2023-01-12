package com.alex.exercise01;

public class test {
    public static void main(String[] args) {
        a aaa = new b();
        System.out.println(aaa.a);
    }
}
class a{
    int a=10;
}
class b extends a{
    int a=20;
}
