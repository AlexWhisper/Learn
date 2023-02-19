package com.alex.Iterator_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * @author Alex
 * @version 1.0
 */
public class iteration03 {
    public static void main(String[] args) {

        ;
       ;

        Collection col=new ArrayList();
        col.add(new Dog("小白","20"));
        col.add(new Dog("小黑","21"));
        col.add( new Dog("小小","10"));

        Iterator iterator = col.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

        System.out.println("======使用foreach=======");
        for (Object o :
                col) {
            System.out.println(o);
        }
    }
}
class Dog{
    private String name;
    private String age;

    public Dog(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
