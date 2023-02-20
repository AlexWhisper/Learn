package com.alex.thread_;

import java.util.Scanner;

public class thread05 {
    public static void main(String[] args) {
//        SellTicket01 sellTicket01 = new SellTicket01(); //sellTicket01对象的类继承了Thread类，重写了run方法，可以直接通过调用对象名.start()方法来创建线程
//        SellTicket01 sellTicket02 = new SellTicket01(); //sellTicket01对象的类继承了Thread类，重写了run方法，可以直接通过调用对象名.start()方法来创建线程
//        SellTicket01 sellTicket03 = new SellTicket01(); //sellTicket01对象的类继承了Thread类，重写了run方法，可以直接通过调用对象名.start()方法来创建线程
//        sellTicket01.start();
//        sellTicket02.start();
//        sellTicket03.start();


         //sellTicket02对象的类实现了Runnable接口，并且重写run方法，可以通过再创建要给Thread类，通过有参构造器，将实现了Runnable接口的对象传入，再调用Thread对象的run方法来实线程的创建
        SellTicket02 sellTicket02 = new SellTicket02();
        Thread thread01 = new Thread(sellTicket02);
        Thread thread02 = new Thread(sellTicket02);
        Thread thread03 = new Thread(sellTicket02);
        thread01.start();
        thread02.start();
        thread03.start();


        
        
        
        /*
        两种不同的线程创建方式中，如何实现多线程的创建
        1.首先是继承了Thread类的类的对象实现多线程，只需要多new要实现多线程的类的对象就可以实现，需要几个线程，就new几个类的对象，然后依次调用每个线程的start方法，如果存在需要被多个线程所共享的临界资源，因为是new出来了多个对象，需要将对应成员属性设置为static

        2.如果是实现了Runnable接口的类，想要创建多线程，只需要new一个要创建多线程的对象，new多个Thread类，将前面new出来的一个对象传入Thread的构造器。然后调用Thread对象的start方法。需要多少个线程就new多少个Thread。因为new Thread时候传入的是同一个对象，所以无需将临界资源设置为static
         */
    }
}

class SellTicket01 extends Thread { //继承了Thread类
    public static int num = 100;

    @Override
    public void run() {

        while (true) {

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("售票员" + Thread.currentThread().getName() + "开始售票，剩余票数字" + (--num));
                if (num < 0) {
                    break;
                }

        }
    }


}

class SellTicket02 implements Runnable {
    int num = 100;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("售票员" + Thread.currentThread().getName() + "开始售票，剩余票数字" + (--num));
            if (num <= 0) {
                break;
            }
        }
    }
}
