package com.alex.abstract_;

import java.util.Scanner;

/*
 * @author Alex
 * @version 1.0
 */
public class test {
    public static void main(String[] args) {
        String n;
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            n=scanner.next();


            try {
                num =Integer.parseInt(n);
                break;
            } catch (Exception e) {

            }
        } while (true);
        System.out.println("你输入的数字是"+num);
    }
}
