package com.alex.Poly01_.PolyParmeter;

public class Manger extends Employee{
    private double bonus;

    public Manger(String name, double sal, double bonus) {
        super(name, sal);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getAnnual() {
        return super.getAnnual()+bonus;
    }

    public void manage(){

        System.out.println("经理"+getName()+"正在管理");
    }
}
