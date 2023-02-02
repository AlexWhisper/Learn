package com.alex.innerClass_;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class AnonymousInnerClass {
    public static void main(String[] args) {
//        Tiger tiger = new Tiger();
//        tiger.cry();
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎叫唤");
            }
        };
        tiger.cry();

        Animal animal=new Animal(){
            @Override
            public void say() {
                System.out.println("重写了say 方法");
            }
        };
        animal.say();
        CBC cc=new CBC(){
            @Override
            public void run() {
                System.out.println("重写了run方法");
            }
            public void eary(){
                System.out.println("gegeg");
            }
        };
        cc.run();


    }
}
interface IA {
    public void cry();
}
class Animal{
    public void say(){
        System.out.println("动物说话");
    }
}

abstract class CBC{
    public abstract void run();
}
//class Tiger implements IA{
//    @Override
//    public void cry() {
//        System.out.println("老虎叫唤");
//    }
//}
