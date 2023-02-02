package com.alex.interface_;

public class Interface05 {
    public static void main(String[] args) {
        LittleMonkey tom = new LittleMonkey("tom");
        tom.clim();
        tom.swim();
        tom.fly();
    }

}
class Monkey{
    String name;
    public Monkey(String name) {
        this.name = name;
    }
    public void clim(){
        System.out.println("爬树");
    }
}

interface fishAble{
    public void swim();
}

interface birdAble{
    public void fly();
}

class LittleMonkey extends Monkey implements fishAble,birdAble{
    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("经过学习，学会了飞翔");
    }

    @Override
    public void swim() {
        System.out.println("经过学习，学会了游泳");
    }
}

