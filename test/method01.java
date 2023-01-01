package test;

import java.util.Scanner;

public class method01 {

    public static void main(String[] args){
        Person1 p1=new Person1();
        p1.speak();
        p1.cal01();
        p1.cal02();
        p1.getSum(2,4);
    }
}
class Person1{
    String name;
    int age;
    public void speak(){
        System.out.println("我是一个人！");
    }
    public void cal01(){
        int sum=0;
        for(int i=0;i<=1000;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
    public void cal02(){
        int sum=0;
        int n=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
    public void getSum(int a,int b){
        System.out.println(a+b);
    }
}
