package com.alex.pack;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person p=new Person();


        System.out.println(p.name+p.getAge()+p.getJob()+p.getSalary());
    }
}
class Person{
    public String name;
    private int age;
    private double salary;
    private String job;

    public Person() {
    }

    public Person(String name, int age, double salary, String job) {
        this.setName(name);
        this.setAge(age);
        this.setSalary(salary);
        this.setJob(job);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>=2 && name.length()<=6) {
            this.name = name;
        }else {
            System.out.println("姓名输入错误");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>1 && age<120) {
            this.age = age;
        }else
            System.out.println("年龄输入有误");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
