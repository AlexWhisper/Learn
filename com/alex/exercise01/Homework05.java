package com.alex.exercise01;

import com.alex.Poly01_.Bone;

public class Homework05 {
    public static void main(String[] args) {
        GNF gnf = new GNF(3000);
        Teacher teacher = new Teacher(3000, 100);
        scientis sci = new scientis(3000, 1000);
        System.out.println(gnf.printSal());
        System.out.println(teacher.printSal());
        System.out.println(sci.printSal());

    }
}
class YuanGong{

    private double salary;

    public YuanGong(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double printSal(){
        return salary;
    }
}
class GNF extends YuanGong{
    public GNF(double salary) {
        super(salary);
    }

    @Override
    public double printSal() {
        return super.printSal();
    }
}
class Teacher extends YuanGong{
    private double coursePay;

    public Teacher(double salary, double coursePay) {
        super(salary);
        this.coursePay = coursePay;
    }

    public double getCoursePay() {
        return coursePay;
    }

    public void setCoursePay(double coursePay) {
        this.coursePay = coursePay;
    }

    @Override
    public double printSal() {
        return super.printSal()+coursePay*30;
    }
}

class scientis extends YuanGong{
    private double Boune;

    public scientis(double salary, double boune) {
        super(salary);
        Boune = boune;
    }

    @Override
    public double printSal() {
        return super.printSal()+ Boune;
    }

}

