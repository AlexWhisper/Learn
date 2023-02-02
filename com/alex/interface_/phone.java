package com.alex.interface_;

public class phone implements UsbInterface{
    @Override
    public void start() {
        System.out.println("手机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作");

    }
    public void call(){
        System.out.println("特有的call方法被调用");

    }
}
