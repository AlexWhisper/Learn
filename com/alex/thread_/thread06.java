package com.alex.thread_;

public class thread06 {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        Thread thread = new Thread(a);
        thread.start();
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println("main方法正在执行中");
        }
        a.setFlag(false);

    }

}
class A implements Runnable{

    private boolean flag=true;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        while(flag){
            System.out.println(Thread.currentThread().getName()+"执行中");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
