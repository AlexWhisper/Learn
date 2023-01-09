package com.alex.exercise01;

public class Homework08 {
    public static void main(String[] args) {

    }
}
class BankAccount{
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(double initalBalance){
        this.balance=initalBalance;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        balance-=amount;
    }

}
class CheckingAccount extends BankAccount{


    public CheckingAccount(double initalBalance) {
        super(initalBalance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        System.out.println("当前余额"+super.getBalance());
        super.setBalance(super.getBalance()-1);
        System.out.println("存款成功，收取手续费1元，剩余余额"+super.getBalance());
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("当前余额"+super.getBalance());
        super.withdraw(amount);
        System.out.println("取款成功，手续费1元，当前余额"+super.getBalance());
    }
}

class SavingAccount extends BankAccount{
    private int freetimes=3;

    public SavingAccount(double initalBalance, int freetimes) {
        super(initalBalance);
        this.freetimes = freetimes;
        if (freetimes>1){

        }
        this.freetimes-=1;
    }
    public void earnMonthlyInterest(){

    }
}