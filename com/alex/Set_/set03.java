//package com.alex.Set_;
//
//import java.sql.SQLOutput;
//import java.util.HashSet;
//import java.util.Objects;
//import java.util.Set;
//
//public class set03 {
//    public static void main(String[] args) {
//        Set set = new HashSet();
//        set.add(new Employee("alex",20));
//        set.add(new Employee("tom",21));
//        set.add(new Employee("jack",19));
//        set.add(new Employee("jack",19));
//        set.add(new Employee("jack",19));
//        System.out.println(set.size());
//
//    }
//}
//class Employee{
//    private String name;
//    private int age;
//
//
//    public Employee(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return age == employee.age && Objects.equals(name, employee.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }
//}
