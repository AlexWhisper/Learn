package com.alex.final_;

public class FinalExercise01 {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);
        System.out.println(c1.area());
    }
}
class Circle{
    private double radius;
    private final double PI=3.14;
    public Circle(double radius){
        this.radius=radius;
    }
    public double area(){
        return radius*radius*PI;
    }
}
