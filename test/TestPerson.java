package test;

public class TestPerson {
    public static void main(String[] args) {
        Person p1=new Person("小明",19);
        Person p2=new Person("小明",19);
        System.out.println(p1.compareTo(p2));
    }

}
class Person{
    String name;
    int age;
    //构造器
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public boolean compareTo(Person p){
        if (this.name==p.name&&this.age==p.age){
            return true;
        }else return false;
    }
}
