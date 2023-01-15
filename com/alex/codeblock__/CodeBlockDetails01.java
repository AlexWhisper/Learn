package com.alex.codeblock__;
public class CodeBlockDetails01 {
    public static void main(String[] args) {
        Son son = new Son();
        /*
        父类静态代码块
        父类普通代码块
        父类构造器
        子类静态代码块
        子类普通代码块
        子类构造器
         */
    }
}

class Father{
    {
        System.out.println("父类的代码块被调用");
    }
    static{
        System.out.println("父类的静态代码块被调用");
    }
    public Father(){
        //隐含的super();

        //隐含了一个普通代码块
        System.out.println("父类构造器被调用");
    }
}
class Son extends Father{

    {
        System.out.println("子类的代码块被调用");
    }
    static{
        System.out.println("子类的静态代码块被调用");
    }
    public Son(){
        //隐含的super();

        //隐含了一个普通代码块
        System.out.println("子类构造器被调用");
    }

}