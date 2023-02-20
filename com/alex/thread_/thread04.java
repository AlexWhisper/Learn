package com.alex.thread_;

public class thread04 {
    public static void main(String[] args) {
        hiClass hiClass = new hiClass();
        helloClass helloClass = new helloClass();
        Thread thread = new Thread(hiClass);
        Thread thread1 = new Thread(helloClass);
        thread1.start();
        thread.start();
    }

}
class hiClass implements Runnable{
    public void hi(){
        int i=0;

        while (true) {
            System.out.println("hi"+(++i)+"当前线程为："+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (i==10)break;
        }
    }

    @Override
    public void run() {
        hi();
    }
}

class helloClass implements Runnable{
    public void hello(){
        int i=0;

        while (true) {
            System.out.println("Hello world"+(++i)+"当前线程为："+Thread.currentThread().getName());
            try {

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (i==10)break;
        }
    }

    @Override
    public void run() {
        hello();
    }
}
