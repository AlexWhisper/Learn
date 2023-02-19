package com.alex.Set_;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;

public class set04 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("alex",1000,new MyDate(2023,11,11)));
        hashSet.add(new Employee("tom",2000,new MyDate(2023,11,11)));
        hashSet.add(new Employee("jack",2000,new MyDate(2023,11,11)));
        hashSet.add(new Employee("alex",20020,new MyDate(2023,11,11)));
        hashSet.add(new Employee("alex",20020,new MyDate(2223,11,11)));


        System.out.println(hashSet.size());
    }
}
class Employee{
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(birthday, employee.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }
}