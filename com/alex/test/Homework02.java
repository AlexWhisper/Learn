package com.alex.test;

public class Homework02 {
    public static void main(String[] args) {
        String[] s={"hello","world","i am a student","Alex"};
        String key="Alex";
        A02 a=new A02();
        System.out.println(a.find(s,key));

    }
}
class A02{
    public A02(){
    }
    public int find(String[] s,String key){
        int flag=-1;
        for (int i=0;i<s.length;i++){
            if(s[i]==key){
                flag=i;
                break;
            }
        }
        return flag;
    }
}



