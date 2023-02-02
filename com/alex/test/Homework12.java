package com.alex.test;

public class Homework12 {
}
class Employee{
    String name;
    String sex;
    int age;
    String zhiwei;
    double sal;
    public Employee(String name,String sex,int age,String zhiwei,double sal){
        this.name=name;
        this.sex=sex;
        this.age=age;
        this.zhiwei=zhiwei;
        this.sal=sal;
    }
    public Employee(String name,String sex,int age){
        this.name=name;
        this.sex=sex;
        this.age=age;
    }
    public Employee(String zhiwei,double sal){
        this.sal=sal;
        this.zhiwei=zhiwei;
    }

}
