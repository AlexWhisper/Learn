package com.alex.Poly01_.polyarr_;

public class Teacher extends Person {
    private double sal;

    public Teacher(String name, int age, double sal) {
        super(name, age);
        this.sal = sal;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String say() {
        return super.say()+getSal();
    }
    public String teach(){
        return "教书";
    }
}
