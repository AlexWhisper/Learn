package com.alex.smallchange;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        int key=0;
        double count=0,money=0;
        String details="";
        Date date =null;
        boolean flag=true;
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("==============零钱通菜单==============");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退出");
            System.out.println("请选择1-4：");
            key=scanner.nextInt();

            switch (key){
                case 1:
                    System.out.println("----------零钱明细----------");
                    System.out.println(details);

                    break;
                case 2:
                    System.out.println("请输入您的入账金额");
                    money=scanner.nextDouble();
                    if (money <=0){
                        System.out.println("入账金额应该大于0元");
                        break;
                    }
                    count+=money;
                    date=new Date();
                    details+="\n收益入账\t"+money+"\t"+sdf.format(date)+"\t"+count;
                    break;
                case 3:
                    System.out.println("请输入您的消费金额");
                    money=scanner.nextDouble();
                    if (money<=0||money>count){
                        System.out.println("消费金额应该在0-"+count+"之间");
                        break;
                    }
                    count-=money;
                    System.out.println("请输入您的消费说明");
                    String str=scanner.next();

                    date=new Date();
                    details+="\n"+str+"\t"+money+"\t"+sdf.format(date)+"\t"+count;
                    break;
                case 4:
                    String choice="";
                    while (true){
                        System.out.println("你确定你要退出吗？y/n");
                        choice =scanner.next();
                        if (choice.equals("y")||choice.equals("n")){
                            break;
                        }

                    }
                    if (choice.equals("y")){
                        flag=false;
                        break;
                    }else {
                        break;
                    }

                default:
                    System.out.println("输入错误！");
                    break;
            }
        }while(flag);


    }
}
