package com.alex.abstract_;

import com.alex.Poly01_.Dog;

public class abstract01 {
    public static void main(String[] args) {
//        Animal animal = new Animal("动物");//抽象类无法实现，只能继承。
        dog sp = new dog("斯巴克");
        cat tom = new cat("tom");
        tom.speak();
        sp.speak();
    }
}
abstract class Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    public abstract void speak();
}

class cat extends Animal{
    public cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("喵喵喵");
    }
}
class dog extends Animal{
    public dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("汪汪汪");
    }
}
