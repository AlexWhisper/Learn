package com.alex.Poly01_.PolyParmeter;

public class Worker extends Employee{
    public Worker(String name, double sal) {
        super(name, sal);
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }

    public void work(){
        System.out.println("工人"+getName()+"正在工作");
    }
}
