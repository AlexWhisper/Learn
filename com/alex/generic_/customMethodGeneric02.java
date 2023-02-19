package com.alex.generic_;

public class customMethodGeneric02 {
    public static void main(String[] args) {

    }
}
class normalClss{  //这是一个普通类
      public <E> void hi(E e){ //注意，访问修饰符后存在泛型，即为泛型方法
        System.out.println("这是在一个普通类中使用了 泛型方法");
    }

}

class genericClass<T,U>{//这是一个泛型类，因为在类名后面跟着泛型
    public <E,T> void hi(E e){ //这是一个泛型方法，因为访问修饰符后面有泛型

    }
    public void run(U u,T t){ //这是一个使用了泛型的普通方法，因为在访问修饰符后面没有泛型

    }

    /*
    *泛型方法，可以用在普通类和泛型类当中
    *使用了泛型的普通方法，只能在泛型类当中，而且用到的泛型，需要在类明后面声明过
    *
    *
    *
     */

}