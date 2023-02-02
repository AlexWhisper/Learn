package com.alex.innerClass_;

public class LocalInerClass {
    public static void main(String[] args) {
        new Outer03().m2();
    }
}
class Outer03{//这是一个外部类
    private int n=10;
    private void m1(){}
    public void m2(){
        int n2=20;
        class LocalInnerClass{ //这是一个内部类,相当于一个局部变量 不能添加访问修饰符
            private int n=30;
            public void hi(){
                System.out.println("这是一个内部类");
                System.out.println(Outer03.this.n);//可以访问外部类所有成员
                m1();
            }
        }

        LocalInnerClass ll = new LocalInnerClass();
        ll.hi();
    }
}


