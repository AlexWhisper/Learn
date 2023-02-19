package com.alex.generic_;

import java.util.*;

public class generic01 {
    public static void main(String[] args) {
        Student student = new Student("小明");
        Student student1 = new Student("小红");
        Student student2 = new Student("小亮");

        HashSet<Student> set = new HashSet<>();
        set.add(student);
        set.add(student1);
        set.add(student2);
        System.out.println("使用增强for循环");
        for (Student stu :
                set) {
            System.out.println(stu.getName());
        }

        System.out.println("使用迭代器");

        Iterator<Student> iterator = set.iterator();
        while (iterator.hasNext()) {
            Student stu = iterator.next();
            System.out.println(stu.getName());

        }

        HashMap<String, Student> map = new HashMap<>();
        map.put("小明",student);
        map.put("小红",student1);
        map.put("小亮",student2);

        System.out.println("增强for  ");
        Set<Map.Entry<String, Student>> entries = map.entrySet();
        Iterator<Map.Entry<String, Student>> iterator1 = entries.iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, Student> next = iterator1.next();
            System.out.println(next.getKey()+"=="+next.getValue());

        }
    }
}
class Student{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}