package test;

import org.w3c.dom.ls.LSOutput;

public class Homework05 {
    public static void main(String[] args) {
        Circle cir=new Circle(3);
        cir.CalC();
        cir.CalS();
    }
}
class Circle {
    double r;
    public Circle(double r){
        this.r=r;
    }
    public void CalC(){
        System.out.println("周长为："+3.14*2*r);

    }
    public void CalS(){
        System.out.println("面积为："+3.15*r*r);
    }
}