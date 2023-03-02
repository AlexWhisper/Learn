package com.alex.file_;

import java.io.*;

public class objectOutputSteam01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("D:\\objout.dat");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        Dog dog = new Dog("旺财", 2);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(dog);
        objectOutputStream.close();
        System.out.println("序列化完成，数据保存成功");


        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Object o = objectInputStream.readObject();
        Dog dog2=(Dog) o;
        System.out.println(dog2);
        objectInputStream.close();
        System.out.println("数据反序列化完成，数据读取成功");



    }
}

class Dog implements Serializable {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}