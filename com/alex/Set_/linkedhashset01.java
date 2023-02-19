package com.alex.Set_;

import java.util.LinkedHashSet;
import java.util.Objects;

public class linkedhashset01 {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new Car2("大众",1000));//ok
        linkedHashSet.add(new Car2("大众",1000));
        linkedHashSet.add(new Car2("大众",1000));
        linkedHashSet.add(new Car2("捷达",1000));//ok
        linkedHashSet.add(new Car2("捷达",10));//ok
        System.out.println(linkedHashSet.size());

    }
}
class Car2{
    private String name;
    private double price;

    public Car2(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car2 car2 = (Car2) o;
        return Double.compare(car2.price, price) == 0 && Objects.equals(name, car2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
    
}
