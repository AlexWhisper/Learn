package com.alex.exercise01;

public class Homework08 {
    public static void main(String[] args) {
        CheckingAccount ck1 = new CheckingAccount(1000);
        ck1.deposit(100);
        System.out.println(ck1.getBalance());
        ck1.withdraw(100);
        System.out.println(ck1.getBalance());

        SavingAccount sa = new SavingAccount(100);
        sa.deposit(100);
        sa.deposit(100);
        sa.deposit(100);
        sa.deposit(100);
        sa.withdraw(100);
        System.out.println(sa.getBalance());
    }
}

class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(double initalBalance) {
        this.balance = initalBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

}

class CheckingAccount extends BankAccount {


    public CheckingAccount(double initalBalance) {
        super(initalBalance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount - 1);

    }

    @Override
    public void withdraw(double amount) {

        super.withdraw(amount + 1);

    }
}

class SavingAccount extends BankAccount {
    private int freetimes = 3;
    private double rate = 0.01;

    public SavingAccount(double initalBalance) {
        super(initalBalance);
    }

    @Override
    public void deposit(double amount) {
        if (freetimes > 0) {
            super.deposit(amount);
        } else {
            super.deposit(amount - 1);
        }
        freetimes--;
    }

    @Override
    public void withdraw(double amount) {
        if (freetimes > 0) {
            super.withdraw(amount);
        } else {
            super.withdraw(amount + 1);
        }

        freetimes--;
    }

    public void earnMonthlyInterest() {
        freetimes = 3;
        setBalance(getBalance() * 1.01);
    }
}