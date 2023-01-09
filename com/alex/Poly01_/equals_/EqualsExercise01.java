package com.alex.Poly01_.equals_;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person p1 = new Person("Alex",19);
        Person p2 = new Person("Alex",19);

//        System.out.println(p1.equals(p2));
        System.out.println(p1.toString());
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj){return true;}
        if (obj instanceof Person){
            Person p=(Person)obj;
            if (p.name==this.name&&p.age==this.age){
                return true;
            }
        }
        return false;
        //f t f t f
        //t f t f t f
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}