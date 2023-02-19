package com.alex.generic_;

import java.util.ArrayList;
import java.util.List;

public class GenericExtends {
    public static void main(String[] args) {
        ArrayList<AA> list = new ArrayList<>(); //在list中可以传入AA类，及其所有AA类的子类
        ArrayList<BB> list1 = new ArrayList<>(); //在list中可以传入AA类，及其所有AA类的子类
        ArrayList<CC> list2 = new ArrayList<>(); //在list中可以传入AA类，及其所有AA类的子类
        list.add(new BB());
        list.add(new CC());
//        t1(list);  //方法形参规定泛型，只能传入BB类以及BB类的子类，而AA类是BB类的父类，故无法传入
        t1(list1);
        t1(list1);
        t1(list2);


        t2(list1);
        t2(list);
//        t2(list2);// 方法参数规定了必须传入BB类，以及BB类的父类，而list2中的泛型规定是CC是BB类的子类，故无法传入

    }
    public static void t1(List<? extends BB> list){ //规定了在方法t1中只能传入BB以及BB子类

    }

    public static void t2(List<? super BB> list){ //规定了在方法t2中只能传入BB以及BB的子类

    }
}

class AA{}
class BB extends AA{}

class CC extends BB{}
