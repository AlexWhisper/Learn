package com.alex.file_;

import java.io.*;
import java.util.Properties;

public class homework03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Properties properties = new Properties();
        properties.load(new BufferedReader(new FileReader("D:\\dog.properties")));
        Dog02 d = new Dog02();
        d.name=properties.getProperty("name");
        d.age=Integer.parseInt(properties.getProperty("age"));
        d.color=properties.getProperty("color");
        System.out.println(d);

        new ObjectOutputStream(new FileOutputStream("D:\\dog.dat")).writeObject(d);
        Dog02 d1 = (Dog02) new ObjectInputStream(new FileInputStream("D:\\dog.dat")).readObject();
        System.out.println(d1);

        
    }
}
class Dog02 implements Serializable{
    String name;
    int age;
    String color;

    @Override
    public String toString() {
        return "Dog02{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
