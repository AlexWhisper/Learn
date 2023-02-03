package com.alex.annotation_;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.sql.SQLOutput;

/*
 * @author Alex
 * @version 1.0
 */
public class Homework08 {
    public static void main(String[] args) {
        Color color=Color.BLACK;
        switch (color){
            case RED:
                System.out.println("匹配到红色");
                break;
            case BLUE:System.out.println("匹配到蓝色");break;
            case BLACK:System.out.println("匹配到黑色");break;
            case YELLOW:System.out.println("匹配到黄色");break;

        }
    }
}
enum Color implements IA{
    RED(255,0,0),
    BLUE(0,0,255),
    BLACK(0,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0),
    ;
    private double redValue;
    private double greenValue;
    private double blueValue;

    Color(double redValue, double greenValue, double blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }



    @Override
    public String show() {
        return "Color{" +
                "redValue=" + redValue +
                ", greenValue=" + greenValue +
                ", blueValue=" + blueValue +
                '}';
    }
}
interface IA{
    String show();
}
