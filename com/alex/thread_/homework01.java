package com.alex.thread_;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

public class homework01 {
    public static void main(String[] args) {

        T1 thread01 = new T1();
        Thread thread = new Thread(thread01);
        thread.start();

        T2 t2 = new T2(thread01);
        Thread thread1 = new Thread(t2);
        thread1.start();
    }

}
class T1 implements Runnable{
    private boolean loop=true;
    @Override
    public void run() {
        while(loop){
            System.out.println((int)(Math.random()*100));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("循环线程退出");
    }//循环随机打印100以内的随机整数

    public boolean isLoop() {
        return loop;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }


}


class T2 implements Runnable {//用来监听键盘读取Q指令
    private T1 thread=null;
    public T2(T1 thread) {
        this.thread=thread;

    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while(thread.isLoop()){
            char c = scanner.next().toUpperCase().charAt(0);
            if (c == 'Q'){
                System.out.println("监听线程退出");
                thread.setLoop(false);
            }

        }

    }

}
