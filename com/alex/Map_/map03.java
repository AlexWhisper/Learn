package com.alex.Map_;

import java.util.*;

public class map03 {
    public static void main(String[] args) {
        Map map = new HashMap();
        for (int i = 0; i < 100; i++) {
            map.put(i,new Employee("员工"+i,100,i));

        }

        System.out.println("使用keySet 增强for循环得到的结果");
        Set keySet = map.keySet();
        for (Object key:
             keySet) {
            if (((Employee)(map.get(key))).getSal()>18000){
                System.out.println(((Employee)(map.get(key))));
            }
        }


        System.out.println("使用values和迭代器得到的结果");

        Collection values = map.values();
        Iterator iterator = values.iterator();

        while (iterator.hasNext()) {
            Employee e = (Employee) iterator.next();
            if (e.getSal()>18000){
                System.out.println(e);
            }
        }

        System.out.println("使用entrySet得到的结果");
        Set entrySet = map.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator1.next();
            if (((Employee)entry.getValue()).getSal()>18000){
                System.out.println(((Employee)entry.getValue()));
            }

        }
    }

}
class Employee{
    private String name;
    private double sal;
    private int id;

    public Employee(String name, double sal, int id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id=" + id +
                '}';
    }

    @Override
    public int hashCode() {
        return 100;
    }
}

