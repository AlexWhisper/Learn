package com.alex.Poly01_;

import java.nio.file.attribute.DosFileAttributes;

public class Poly01 {

    public static void main(String[] args) {
        Dog spark =new Dog("spark");
        Bone bone=new Bone("骨头");
        Master master=new Master("master");
        Cat cat=new Cat("tom");
        Fish fish=new Fish("小鱼");

        System.out.println(master.feed(spark,bone));
        System.out.println(master.feed(cat,fish));

    }
}
