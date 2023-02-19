package com.alex.Set_;

import java.util.HashSet;
import java.util.Set;

public class set01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Set set = new HashSet();
        Dog tom = new Dog("tom");
        Dog jack = new Dog("jack");
        Dog marry = new Dog("marry");
        set.add(tom);
        set.add(jack);
        set.add(tom);
        set.add(marry);

    }
}

class Dog{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return 100;
    }
}
