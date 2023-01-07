package com.alex.Poly01_;

public class Master{
    private String name;

    public Master(String name) {
        this.name = name;
    }

//    public String feed(Dog dog, Bone bone){
//        return name+"给"+dog.getName()+"喂了"+bone.getFood();
//    }
//    public String feed(Cat dog, Fish bone){
//        return name+"给"+dog.getName()+"喂了"+bone.getFood();
//    }
    public String feed(Animal a,Food food){
        return name+"给"+a.getName()+"喂了"+food.getFood();
    }
}
