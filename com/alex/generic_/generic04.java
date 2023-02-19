package com.alex.generic_;


import java.util.ArrayList;
import java.util.Comparator;

public class generic04 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alex",100000,new MyDate(11,25,2023)));
        employees.add(new Employee("Tom",100000,new MyDate(10,25,2021)));
        employees.add(new Employee("Herry",100000,new MyDate(11,30,2023)));
        employees.add(new Employee("Alex",100000,new MyDate(1,22,2023)));

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getName()==o2.getName()){
                    if (o1.getBirthday().getYear()==o2.getBirthday().getYear()){
                        if (o1.getBirthday().getMonth()==o2.getBirthday().getMonth()){
                            if (o1.getBirthday().getDay()==o2.getBirthday().getDay()){
                                return 0;
                            }
                            return o1.getBirthday().getDay()-o2.getBirthday().getDay();
                        }
                        return o1.getBirthday().getMonth()-o2.getBirthday().getMonth();
                    }
                    return o1.getBirthday().getYear()-o2.getBirthday().getYear();
                }
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Employee e :
                employees) {
            System.out.println(e);
        }


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

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday.getDay() +" "+birthday.getMonth()+" "+birthday.getYear()+
                '}';
    }
}

class MyDate{
    private int month;
    private int day;
    private int year;

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
