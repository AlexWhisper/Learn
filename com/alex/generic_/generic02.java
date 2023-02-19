package com.alex.generic_;

import java.util.ArrayList;

public class generic02 {
    public static void main(String[] args) {
        Person<String> person = new Person<>();
        person.setName("小明");
        System.out.println(person.getName().getClass().getSimpleName());
        person.hi(new ArrayList<>());
    }
}



class Person<E>{
     private E name;
    public<M> void hi(M m){
        System.out.println(m.getClass().getSimpleName());

    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}

