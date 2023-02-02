package com.alex.interface_;

public class OracleDB implements DBInterface{
    @Override
    public void connection() {//一个普通类实现接口，就必须将接口的所有方法都实现
        System.out.println("开始Oracle访问数据库");

    }

    @Override
    public void disconnection() {
        System.out.println("结束oracle访问数据库");

    }
}

abstract class AAA implements DBInterface{ //AAA是抽象类，实现接口，可以不用实现接口的方法

}

class BBB implements DBInterface,UsbInterface{//一个类可以实现多个接口，每个接口中的方法都要实现

    @Override
    public void connection() {

    }

    @Override
    public void disconnection() {

    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}