package com.alex.annotation_;

/*
 * @author Alex
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.shout();
        dog.shout();
    }
}
abstract class Animal{
    abstract void shout();
}
class Cat extends Animal{
    void shout(){
        System.out.println("喵喵喵");
    }
}
class Dog extends Animal{
    void shout(){
        System.out.println("汪汪汪");
    }
}
