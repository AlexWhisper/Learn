package com.alex.test;

public class Homework14 {
    public static void main(String[] args) {
        JSB j1 = new JSB();
        for (int i = 0; i < 100; i++) {
            j1.start((int) (Math.random() * 10) % 3);
        }
        System.out.println("您获胜了" + j1.count);


    }
}

class JSB {

    int key;
    int count = 0;

    public void start(int key) {
        int c = (int) (Math.random() * 10) % 3;
        System.out.println("您出" + key + "\t电脑出" + c);
        if (key == 0 && c == 1 || key == 1 && c == 2 || key == 2 && c == 0) {
            count++;

        }


    }
}

