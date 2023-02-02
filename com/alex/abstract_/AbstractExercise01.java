package com.alex.abstract_;

public class AbstractExercise01 {
    public static void main(String[] args) {
        Manger tom = new Manger("tom", 10, 10000, 1000);
        Worker jack = new Worker("jack", 20, 1000);
        jack.work();
        tom.work();
    }

}
abstract class Employee{
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public abstract void work();

}

class Manger extends Employee{
    double bounes;

    public Manger(String name, int id, double salary, double bounes) {
        super(name, id, salary);
        this.bounes = bounes;
    }

    @Override
    public void work() {
        System.out.println("经理正在工作中");
    }
}
class Worker extends Employee{
    public Worker(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("普通工人正在哦工作");
    }
}