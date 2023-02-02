package com.alex.interface_;

public interface Interface04 { //接口不能实现其他接口，但是可以继承其他接口
    int a=1;
}
class QQQ implements Interface04{ //接口的修饰符可以是默认和public

}

class test{
    public static void main(String[] args) {
        System.out.println(Interface04.a);
        System.out.println(QQQ.a);
        QQQ qqq = new QQQ();
        System.out.println(qqq.a);


        /*
        类实现接口后，对于接口中的属性，可以用接口名，类名，对象名访问
         */
    }
}