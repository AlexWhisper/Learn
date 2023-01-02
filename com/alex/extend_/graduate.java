package com.alex.extend_;

public class graduate extends Person{

    String sal;

    public graduate(String name, int age) {

        super(name, age);
    }

    public void work(){
        System.out.println("我是大学生，我可以工作");
    }
}
