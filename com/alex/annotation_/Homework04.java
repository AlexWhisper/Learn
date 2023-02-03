package com.alex.annotation_;

import javafx.scene.control.Cell;

/*
 * @author Alex
 * @version 1.0
 */
public class Homework04 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new Calculator() {
            @Override
            public double work(double n1, double n2) {
                return n1+n2;
            }
        },10,8);
        cellphone.testWork(new Calculator() {
            @Override
            public double work(double n1, double n2) {
                return n1*n2;
            }
        },10,8);


    }
}
interface Calculator{
    double work(double n1,double n2);

}
class Cellphone{
    @SuppressWarnings("unuesd")
    void testWork(Calculator calculator,double n1,double n2){
        double res=calculator.work(n1,n2);
        System.out.println(res);
    }
}
