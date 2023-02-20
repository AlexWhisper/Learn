package com.alex.thread_;

import java.util.Scanner;

public class thread05 {
    public static void main(String[] args) {
//        SellTicket01 sellTicket01 = new SellTicket01();
//        SellTicket01 sellTicket02 = new SellTicket01();
//        SellTicket01 sellTicket03 = new SellTicket01();
//        sellTicket01.start();
//        sellTicket02.start();
//        sellTicket03.start();

        SellTicket02 sellTicket02 = new SellTicket02();

        Thread thread = new Thread(sellTicket02);
        Thread thread01 = new Thread(sellTicket02);
        Thread thread02 = new Thread(sellTicket02);
        thread.start();
        thread01.start();
        thread02.start();
//        Scanner scanner = new Scanner();


    }
}

class SellTicket01 extends Thread {
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
