package com.alex.encap;

public class AccountTest {
    public static void main(String[] args) {
        Account a = new Account("小明",2,"1232");
        System.out.println(a.getName()+a.getSal()+a.getPasswd());
    }
}
