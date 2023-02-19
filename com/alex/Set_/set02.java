package com.alex.Set_;

public class set02 {
    public static void main(String[] args) {
        Car dz = new Car("大众", 100);
        Car dz1 = new Car("大众", 100);
        Car dz2 = new Car("大众", 100.1);
        Car dz3 = new Car("捷达", 100.1);
        System.out.println(dz.equals(dz1));
        System.out.println(dz.equals(dz2));
        System.out.println(dz.equals(dz3));
        System.out.println(dz2.equals(dz3));

    }
}
class Car{
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        Car c=(Car) obj;
        return this.name.equals(c.name)&&this.price==c.price;
    }
}