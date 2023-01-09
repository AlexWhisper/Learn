package com.alex.smallchange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSysOOP {

    int key = 0;
    double count = 0, money = 0;
    String details = "";
    Date date = null;
    boolean flag = true;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    Scanner scanner = new Scanner(System.in);

    public void mainMenu() {
        do {
            System.out.println("==============零钱通菜单==============");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退出");
            System.out.println("请选择1-4：");
            key = scanner.nextInt();

            switch (key) {
                case 1:
                    this.details();
                    break;
                case 2:
                    this.income();
                    break;
                case 3:
                    this.outcome();
                    break;
                case 4:
                    this.exit();
                    break;


            }
        } while (flag);
    }
    public void details(){
        System.out.println("----------零钱明细----------");
        System.out.println(details);
    }
    public void income() {
        System.out.println("请输入您的入账金额");
        money = scanner.nextDouble();
        if (money <= 0) {
            System.out.println("入账金额应该大于0元");
            return;
        }
        count += money;
        date = new Date();
        details += "\n收益入账\t" + money + "\t" + sdf.format(date) + "\t" + count;
        return;
    }

    public void outcome() {
        System.out.println("请输入您的消费金额");
        money = scanner.nextDouble();
        if (money <= 0 || money > count) {
            System.out.println("消费金额应该在0-" + count + "之间");
            return;
        }
        count -= money;
        System.out.println("请输入您的消费说明");
        String str = scanner.next();

        date = new Date();
        details += "\n" + str + "\t" + money + "\t" + sdf.format(date) + "\t" + count;
        return;
    }

    public void exit() {
        String choice = "";
        while (true) {
            System.out.println("你确定你要退出吗？y/n");
            choice = scanner.next();
            if (choice.equals("y") || choice.equals("n")) {
                break;
            }

        }
        if (choice.equals("y")) {
            flag = false;
            return;
        } else {
            return;
        }
    }
}
