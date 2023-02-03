package com.alex.annotation_;

/*
 * @author Alex
 * @version 1.0
 */
public class Homework05 {
    public static void main(String[] args) {
        A a = new A();
        a.f1();
    }

}
class A{
    private String name="小明";
    public void f1(){
        class B{
            private String name="Alex";
            void show(){
                System.out.println(name);
                System.out.println(A.this.name);
            }

        }
        B b = new B();
        b.show();

    }

}
