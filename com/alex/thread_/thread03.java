package com.alex.thread_;

/*
runnable接口实现多线程的模拟
 */
public class thread03 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        ThreadProxy threadProxy = new ThreadProxy(tiger);
        threadProxy.start();
    }
}

class Animal{}

class Tiger extends Animal implements Runnable{

    @Override
    public void run() {
        System.out.println("老虎嗷嗷叫");
    }
}
class ThreadProxy implements Runnable{
    private Runnable target=null;
    @Override
    public void run() {
        System.out.println("这里是ThreadProxy的run方法，本方法被调用说名出错了");
    }

    public ThreadProxy(Runnable target) { //编写一个静态代理的有参构造器，使其可以传入一个实现了Runnable接口的对象
        this.target = target;
    }
    public void start(){
        start0();
    }

    private void start0() { //调用了传入的实现了Runnable接口的对象的run方法
        target.run();
    }


}