package com.alex.generic_;

public class customInterfaceGeneric {
    public static void main(String[] args) {

    }
}
interface IUsb<U,R>{
//    R a= 100; //在接口中的成员变量a是静态成员，而静态成员无法使用泛型。
    R get(U u);  //在普通方法中使用了接口泛型
    void hi(R r);
    void run(R r1,R r2,U u1,U u2);
    default R method(U u){
        return null;
    }

}

class C implements IUsb{
    @Override
    public Object get(Object o) {
        return null;
    }

    @Override
    public void hi(Object o) {

    }

    @Override
    public void run(Object r1, Object r2, Object u1, Object u2) {

    }

    @Override
    public Object method(Object o) {
        return IUsb.super.method(o);
    }
}
class A implements IUsb<String,Integer>{ //在类实现泛型接口时候，确定了泛型接口类型
    @Override
    public Integer get(String s) {
        return null;
    }

    @Override
    public void hi(Integer integer) {

    }

    @Override
    public void run(Integer r1, Integer r2, String u1, String u2) {

    }

    @Override
    public Integer method(String s) {
        return IUsb.super.method(s);
    }
}

interface MyInterface extends IUsb<String,Integer>{}  //在接口继承泛型接口时候确定了泛型接口的类型

class D implements MyInterface{ // 在MyInterface 中已经确定了Iusb泛型接口中的泛型类型，所以在类D中实现了MyINterface接口无需再去指定泛型接口类型
    @Override
    public Integer get(String s) {
        return null;
    }

    @Override
    public void hi(Integer integer) {

    }

    @Override
    public void run(Integer r1, Integer r2, String u1, String u2) {

    }

    @Override
    public Integer method(String s) {
        return MyInterface.super.method(s);
    }
}

