package com.alex.exercise01;

import com.alex.Poly01_.PolyParmeter.Worker;

public class Homework04 {
    public static void main(String[] args) {
        Manger alex = new Manger("Alex", 100, 30);
        worker mike = new worker("Mike", 100, 30);
        System.out.println(alex.printSal());
        System.out.println(mike.printSal());
    }
}
class Employee{
    private String name;
    private double daySalary;
    private int workDay;

    public Employee(String name, double daySalary, int workDay) {
        this.name = name;
        this.daySalary = daySalary;
        this.workDay = workDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }

    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }

    public String printSal() {
        return "信息如下" +
                "name='" + name + '\'' +
                ", daySalary=" + daySalary +
                ", workDay=" + workDay;
    }
}
class Manger extends Employee{
    public Manger(String name, double daySalary, int workDay) {
        super(name, daySalary, workDay);
    }

    @Override
    public String printSal() {
        return super.printSal()+"总工资为："+super.getDaySalary()*super.getWorkDay()*1.2;
    }
}
class worker extends Employee{
    public worker(String name, double daySalary, int workDay) {

        super(name, daySalary, workDay);
    }

    @Override
    public String printSal() {
        return super.printSal()+"总工资为："+super.getDaySalary()*super.getWorkDay();
    }
}

