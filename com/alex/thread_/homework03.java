package com.alex.thread_;

public class homework03 {
    public static void main(String[] args) {
        Account2 account2 = new Account2();
        Thread thread1 = new Thread(account2);
        Thread thread2 = new Thread(account2);
        thread1.start();
        thread2.start();

    }
}

class Account2 implements Runnable {
    private double money = 10000;

    @Override
    public void run() {

        while (true) {

            synchronized (this) {
                if (money >= 1000) {
                    money -= 1000;
                    System.out.println(Thread.currentThread().getName() + "取现成功，当前余额为" + money);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + "余额不足，当前余额为" + money);
                    break;
                }
            }
        }
    }


}
