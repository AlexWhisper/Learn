package com.alex.extend_;

public class Person {
    private String name;
    private int age;
    private double score;

    public Person(String name) {
        System.out.println("父类构造器被调用");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void say(){
        System.out.println("你好啊，我是人");

    }

}
