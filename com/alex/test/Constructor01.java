package com.alex.test;

public class Constructor01 {
    public static void main(String[] args) {
        Objectcon ob1=new Objectcon("Alex",20);
        ob1.say();


    }
}
class Objectcon{
    String name;
    int age;
    public Objectcon(String Sname,int Sage){  //构造器
        name=Sname;
        age=Sage;
    }
    public void say(){
        System.out.println("我是"+name+"我今年"+age+"岁了");
    }
}
