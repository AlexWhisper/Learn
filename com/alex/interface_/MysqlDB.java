package com.alex.interface_;

public class MysqlDB implements DBInterface{
    @Override
    public void connection() {
        System.out.println("开始mysql访问数据库");
    }

    @Override
    public void disconnection() {
        System.out.println("结束mysql访问数据库");

    }
}
