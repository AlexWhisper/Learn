package com.alex.test;

import java.util.Scanner;

public class arrayADD {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int flag=1;
        System.out.println("是否插入新元素：");
        Scanner sc=new Scanner(System.in);
        String yn=sc.next();
        switch (yn){
            case "y": case "Y":flag=1;break;
            case "n": case "N":flag=0;

        }
        while(flag==1){
            System.out.println();
            System.out.println("请输入要插入的数据");
            int newnum=sc.nextInt();
            int[] temp=new int[arr.length+1];
            for (int i=0;i<arr.length;i++){
                temp[i]=arr[i];
            }
            temp[arr.length]=newnum;
            arr=temp;


            System.out.println("是否插入新元素：");
            yn=sc.next();
            switch (yn){
                case "y": case "Y":flag=1;
                case "n": case "N": flag=0;

            }
        }

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
