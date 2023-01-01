package test;

public class Homework07 {
    public static void main(String[] args) {
        Dog xiaohong=new Dog("小红","green",2);
        Dog xiaobai=new Dog("小白","black",3);
        xiaohong.show();
        xiaobai.show();
    }
}
class Dog{
    String name;
    String color;
    int age;

    public Dog(String name,String color,int age){
        this.name=name;
        this.age=age;
        this.color=color;
    }
    public void show(){
        System.out.println(name+color+age);
    }
}
