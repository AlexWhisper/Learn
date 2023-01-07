package com.alex.override;

public class OverrideExercise {
    public static void main(String[] args) {
        Person p=new Person("小人","18");
        System.out.println(p.say());
        Student s=new Student("小学生","20",2,100);
        System.out.println(s.say());
    }
}
class Student extends Person {
    private int id;
    private int score;

    public Student(String name, String age, int id, int score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public String say(){
        return super.say()+"我的学号是"+id+"我的分数是"+score;
    }
}
class Person{
    private String name;
    private String age;

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String say(){
        return "hello,我叫"+name+"我今年"+age+"岁了";
    }
}
