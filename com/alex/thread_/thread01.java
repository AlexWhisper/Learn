package com.alex.thread_;

public class thread01 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("主方法开始执行,当前的线程名为："+Thread.currentThread().getName());
        Cat cat = new Cat();
        System.out.println("开始调用多线程的run方法");
//        cat.run(); //如果直接调用run方法，其实并没有启动多线程，相当于在主线程中执行了run方法
        cat.start(); //只有当调用start方法的时候，才是真正的创建了一个现线程。
        for (int i = 0; i < 100; i++) {
            System.out.println("当前为Main方法，线程名："+Thread.currentThread().getName());
            Thread.sleep(1000);
        }
        System.out.println("主方法结束执行");
    }
}
class Cat extends Thread{ //当一个类继承了Thread类之后，就可以调用多线程,

//在Thread中的有一个run方法，是继承来自Runable接口的，Thread中还有一个start方法，该方法会调用一个start0方法，由start0
    //真正的开启一个线程，而start0是一个本地方法，由C、C++实现
    @Override
    public void run() {//多线程类需要重写run方法，具体多线程的实现功能放在run方法中去实现
        int i=0;
        while (true) {
            i++;
            System.out.println("创建了小猫"+i+"号，喵喵喵"+"当前的线程名为："+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
