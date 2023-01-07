package com.alex.Poly01_.detail;

public class Cat extends Animal {
    String name="猫";

    @Override
    public void eat() {

        System.out.println("吃鱼");
    }
    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}
