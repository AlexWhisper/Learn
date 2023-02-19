package com.alex.generic_;



import java.util.ArrayList;

public class generic03 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<int> ints = new ArrayList<int>();//不能传入基本数据类型，之恶能传入引用数据类型。
        ArrayList<Animal> list1 = new ArrayList<>();
        list1.add(new Animal());
        list1.add(new Dog()); //可以传入泛型类型及其指定类型。


    }
}

class Animal{

}
class Dog extends Animal{

}