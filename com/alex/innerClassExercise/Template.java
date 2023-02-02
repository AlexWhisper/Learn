package com.alex.innerClassExercise;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Template {
    public static void main(String[] args) {
        Outer outer = new Outer(100); //有参构造一个
        Outer.inner inn = outer.new inner();
        inn.m2();
        outer.m1();
        new interface01(){
            public void hi(){
                System.out.println("通过匿名内部类实现了接口的hi方法");
            }
            public void say(){
                System.out.println("通过匿名内部类实现接口的say方法");
            }
        }.say();

        new other(){

        }.hi();
        new other(){
            void hi(){
                System.out.println("这个是匿名内部类重写的hi方法");
            }
        }.hi();
    }

}
class Outer{
    private int n1=100; //私有的成员属性

    public Outer(int n1) { //含参构造器
        this.n1 = n1;
    }
    public void m1(){
        System.out.println("这是外部类的一个方法"); // 外部类提供的一个public方法
        inner inner = new inner();
        inner.m2(); //局部内部类可以被外部类实例化，但是不能被
    }

    class inner{ //在外部类中包含的一个内部类 成员内部类
        public void m2(){
            System.out.println(n1+"这个是局部内部类的一个方法"); //在内部类中可以直接访问外部类所包含的私有属性
        }

    }
}
class other{
    void hi(){
        System.out.println("这个是类自带的hi方法");
    }
    void say(){
        System.out.println("这个是类自带的say方法");
    }
}
interface interface01{
    void hi();
    void say();
}