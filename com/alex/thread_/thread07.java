package com.alex.thread_;

public class thread07 {
    public static void main(String[] args) throws InterruptedException {
        AA aa1 = new AA();
        Thread thread1 = new Thread(aa1);
        thread1.setName("线程1");
        thread1.start();
        MyDaemon myDaemon = new MyDaemon();
        Thread thread = new Thread(myDaemon);
        thread.setDaemon(true);
        thread.start();

//        AA2 aa2 = new AA2();
//        Thread thread2 = new Thread(aa2);
//        thread2.setName("线程2");
//        thread2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("这里是"+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (i==5){
                thread1.join();
            }
        }
    }
}

class AA implements Runnable{
    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("这里是"+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}



class AA2 implements Runnable{

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("这里是"+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
class MyDaemon implements Runnable {

    @Override
    public void run() {
        while(true){
            System.out.println("守护线程执行中。。。。。。。");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

