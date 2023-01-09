package com.alex.exercise01;

import javax.print.Doc;

public class Homework10 {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("alex", 19, "doc", "男", "2000");
        Doctor d2 = new Doctor("blex", 19, "doc", "男", "2000");
        System.out.println(d1.equals(d2));

    }
}
class Doctor{
    private String name;
    private int age;
    private String job;
    private String gender;
    private String sal;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSal() {
        return sal;
    }

    public void setSal(String sal) {
        this.sal = sal;
    }

    public Doctor(String name, int age, String job, String gender, String sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Doctor){
            if (((Doctor) obj).getName()==this.name&&((Doctor) obj).getAge()==this.age&&((Doctor) obj).getGender()==this.gender&&((Doctor) obj).getJob()==this.job&&((Doctor) obj).getSal()==this.sal){
                return true;
            }
        }
        return false;
    }
}
