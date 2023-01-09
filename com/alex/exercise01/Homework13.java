package com.alex.exercise01;

public class Homework13 {
    public static void main(String[] args) {
        Person_13[] p=new Person_13[4];
        p[0]=new Student_13("alex","男",20,001);
        p[1]=new Student_13("blex","男",20,001);
        p[2]=new Teacher_13("clex","男",20,10);
        p[3]=new Teacher_13("dlex","男",20,12);
        System.out.println(((Student_13)p[0]).toString());
        System.out.println(((Teacher_13)p[2]).toString());
    }
}
class Student_13 extends Person_13{

    private int stu_id;

    public Student_13(String name, String sex, int age, int stu_id) {
        this.setName(name);
        this.setAge(age);
        this.setSex(sex);
        this.stu_id = stu_id;
    }
    public String study(){
       return "good good study";
    }
    public String play(){
        return super.play()+"玩足球";
    }

    @Override
    public String toString() {
        return "学生的信息：" +
                super.toString()+
                "\n学号=" + stu_id +"\n"+
                this.study()+"\n"+
                this.play();

    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
class Teacher_13 extends Person_13{

    private int work_age;

    public Teacher_13(String name, String sex, int age, int work_age) {
        this.setName(name);
        this.setAge(age);
        this.setSex(sex);
        this.work_age = work_age;
    }
    public String teach(){
        return "good good teach";
    }
    public String play(){
        return super.play()+"玩象棋";
    }

    @Override
    public String toString() {
        return "老师的信息：" +
                super.toString()+
                "\n工龄=" + work_age +"\n"+
                this.teach()+"\n"+
                this.play();
    }
}
class Person_13{
    private String name;
    private String sex;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String play(){
        return name;
    }

    @Override
    public String toString() {
        return
                "\n姓名='" + name + '\'' +
                ", \n性别='" + sex + '\'' +
                ", \n年龄=" + age
               ;
    }
}
