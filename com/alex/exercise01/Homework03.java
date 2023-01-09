package com.alex.exercise01;

import com.alex.Poly01_.polyarr_.Teacher;

public class Homework03 {
    public static void main(String[] args) {
        professor p=new professor("alex",20,"教授",100000);
        System.out.println(p.introduce());
    }
}
class teacher{
    private String name;
    private int age;
    private String post;
    private double salary;

    public teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String introduce() {
        return "老师信息为：" +
                "姓名='" + name + '\'' +
                ", 年龄=" + age +
                ", 职位='" + post + '\'' +
                ", 薪水=" + salary +
                '}';
    }
}

class professor extends teacher{
    private double salary;

    public professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
        this.salary = salary*1.3;
    }
    @Override
    public String introduce() {
        return super.introduce();
    }
}
class fuprofessor extends teacher{
    private double salary;

    public fuprofessor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
        this.salary = salary*1.2;
    }
    @Override
    public String introduce() {
        return super.introduce();
    }
}
class jiangshi extends teacher{
    private double salary=super.getSalary()*1.1;

    public jiangshi(String name, int age, String post, double salary) {
        super(name, age, post, salary);
        this.salary = salary*1.1;
    }

    @Override
    public String introduce() {
        return super.introduce();
    }
}