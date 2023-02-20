package com.alex.thread_;

public class thread02 {
    public static void main(String[] args) {
        AAA aaa = new AAA();
        Thread thread = new Thread(aaa);
        thread.start();
    }

}
class AAA extends BBB implements Runnable{//当一个类已经继承一个其他之后，无法再继承Thread类，这是因为java是单继承机制，想要在该类实现多线程就需要实现一个Runable接口
    @Override
    public void run() { //实现了Runnable接口的Run方法
        System.out.println("多线程调用开始 线程名为："+Thread.currentThread().getName());

    }

}

class BBB{}
