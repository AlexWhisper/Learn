package com.alex.homework_;

import java.util.ArrayList;
import java.util.Iterator;

public class homework02 {
    public static void main(String[] args) {
        Car car1 = new Car("宝马", 400000);
        Car car2 = new Car("宾利", 5000000);

        ArrayList arrayList = new ArrayList();
        arrayList.add(car1);
        arrayList.add(car2);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(car1);
        arrayList2.add(car2);
        System.out.println(arrayList);

        arrayList.remove(car1);
        System.out.println(arrayList);

        System.out.println(arrayList.contains(car1));

        System.out.println(arrayList.size());

        System.out.println(arrayList.isEmpty());

        arrayList.clear();

        arrayList.addAll(arrayList2);

        System.out.println(arrayList.containsAll(arrayList2));

        System.out.println(arrayList);
//        arrayList.removeAll(arrayList2);
        System.out.println("使用增强for");
        for (Object c :
                arrayList2) {
            System.out.println(c);
        }

        System.out.println("使用迭代器");

        Iterator iterator = arrayList2.iterator();
        while (iterator.hasNext()) {
            Object car =  iterator.next();
            System.out.println(car);

        }


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
    public String toString() {
        return "\nCar{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}