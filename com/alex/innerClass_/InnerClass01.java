package com.alex.innerClass_;

public class InnerClass01 {
    public static void main(String[] args) {
        AAA aaa = new AAA();
        AAA.BBBBB bbb=aaa.new BBBBB();
        //Outer.Inner inObject = outObject.new Inner();



    }
}
//局部内部类：写在方法，或者是代码块中的类
class AAA{
    public void A(){
        class jubuneibulei{
            void AAAA(){
                System.out.println("这是局部内部类的方法");
            }
        }

    }

    class BBBBB{
        void hi(){
            System.out.println("这是一个成员内部类");
        }
    }

}
