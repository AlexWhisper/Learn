package com.alex.exercise01;
import java.util.Arrays;
public class HomeWork01 {
    public static void main(String[] args) {
        Person[] p=new Person[3];
        p[0]=new Person("Alex",19,"student");
        p[1]=new Person("Mike",20,"worker");
        p[2]=new Person("tom",10,"teacher");
        for (int i = 0; i < p.length-1; i++) {
            for (int j = 0; j < p.length-i-1; j++) {
                if(p[j].getAge()<p[j+1].getAge()){
                    Person temp=p[j];
                    p[j]=p[j+1];
                    p[j+1]=temp;
                }
            }

        }
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i].toString());
        }
    }
}
class Person{
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
