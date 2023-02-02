package com.alex.test;

public class Homework09 {
    public static void main(String[] args) {
        Music m1=new Music("歌曲1","5分钟");
        String[] res=m1.getInfo();

    }
}
class Music{
    String name;
    String times;
    public Music(String name,String times){
        this.name=name;
        this.times=times;
    }
    public void play(){
        System.out.println("叮叮咚，叮叮咚");
    }
    public String[] getInfo(){
        String[] res=new String[2];
        res[0]=name;
        res[1]=times;
        return res;
    }

}
