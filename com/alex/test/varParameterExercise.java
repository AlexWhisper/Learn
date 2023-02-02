package com.alex.test;

public class varParameterExercise {
    public static void main(String[] args) {
        Objectvarp ob1=new Objectvarp();
        ob1.showScore("小明",60,50,50,120);

    }
}
class Objectvarp{
    public void showScore(String name,double...scores){
        double res=0;
        for (int i=0;i<scores.length;i++){
            res+=scores[i];
        }
        System.out.println("姓名:"+name+"\n总分:"+res);

    }
}

