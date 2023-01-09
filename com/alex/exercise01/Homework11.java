package com.alex.exercise01;

public class Homework11 {
    /*
    上：父类
    下: 子类
    向上转型：父类引用指向子类对象
            Person p=new Student();
            可以调用run()，eat()  //可以调用的方法看编译类型
            调用run()会调用Student的重写后的run()方法，
    向下转型：子类引用 指向一个 指向子类应用的父类应用
            子类类型 引用名=(子类类型)父类引用
            Student p1=(Student)p //可以调用run（）study（）eat（）


    ==和equals的区别：
    ==：是比较运算符可以用来比较基本数据类型和引用数据类型
        基本数据类型比值，引用数据类型比地址
    equals：只能用来比较引用数据类型
        equals 是object自带的方法，默认比地址，大部分时候类会重写equals
     */
}
