package com.alex.encap;

public class Account {
    private String name;
    private double sal;
    private String passwd;

    public Account() {
    }

    public Account(String name, double sal, String passwd) {
        this.setName(name);
        this.setPasswd(passwd);
        this.setSal(sal);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>1&&name.length()<5)
            this.name = name;
        else {
            this.name = "匿名";
            System.out.println("姓名错误，设为默认");
        }
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        if(sal>20) {
            this.sal = sal;
        }else {
            this.sal=20;
            System.out.println("余额最少为20元");

        }
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        if(passwd.length()==6){
            this.passwd=passwd;
        }else {
            this.passwd = "111111";
            System.out.println("默认密码改为111111");
        }
    }
}
