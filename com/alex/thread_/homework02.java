package com.alex.thread_;

public class homework02 {
    public static void main(String[] args) {
        Account account = new Account();
        Thread p1 = new Thread(account);
        Thread p2 = new Thread(account);
        p1.setName("用户1");
        p2.setName("用户2");
        p1.start();
        p2.start();

    }
}
class Account implements Runnable {
    private double money=10000;
    private boolean loop=true;

    public synchronized void saveCash(){
        money+=1000;
    }
    public synchronized void getCash(){

        System.out.println(Thread.currentThread().getName()+"你好，当前余额"+money+"正在取现1000元");
        if (money>=1000) {
            money -= 1000;
            System.out.print(Thread.currentThread().getName()+"取现成功，当前余额为" + money);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }else {
            System.out.print(Thread.currentThread().getName()+"余额不足，当前余额为"+money);
            loop=false;
        }
    }

    @Override
    public void run() {

        while (loop) {
            getCash();
        }
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
