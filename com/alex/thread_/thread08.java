package com.alex.thread_;

public class thread08 {
    public static void main(String[] args) {
//        SellTicket2 sellTicket2 = new SellTicket2();
//        Thread thread1 = new Thread(sellTicket2);
//        Thread thread2 = new Thread(sellTicket2);
//        Thread thread3 = new Thread(sellTicket2);
//
//        thread1.start();
//        thread2.start();
//        thread3.start();

        SellTicket3 sellTicket2 = new SellTicket3();
        Thread thread1 = new Thread(sellTicket2);
        Thread thread2 = new Thread(sellTicket2);
        Thread thread3 = new Thread(sellTicket2);

        thread1.start();
        thread2.start();
        thread3.start();




    }
}

class SellTicket1 extends Thread { //继承了Thread类
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

class SellTicket2 implements Runnable {
    int num = 100;
    private boolean loop=true;
    public synchronized void m(){

            if (num == 0) {
                System.out.println("售票结束");
                loop=false;
                return;
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("售票员" + Thread.currentThread().getName() + "开始售票，剩余票数字" + (--num));


    }
    @Override
    public  void run() {
        while(loop){
            m();
        }
    }
}


class SellTicket3 implements Runnable {
    int num = 100;
    private boolean loop=true;
    @Override
    public  void run() {
        while(loop) {
            synchronized (this) {
                if (num == 0) {
                    System.out.println("售票结束");
                    loop = false;
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("售票员" + Thread.currentThread().getName() + "开始售票，剩余票数字" + (--num));
            }
        }
    }
}
