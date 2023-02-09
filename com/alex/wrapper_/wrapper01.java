package com.alex.wrapper_;

import com.alex.interface_.Interface04;

/*
 * @author Alex
 * @version 1.0
 */
public class wrapper01 {
    public static void main(String[] args) {
        //手动装箱
        int a=100;
        Integer integer = new Integer(a);
        Integer in=Integer.valueOf(a);
        //手动拆箱
        int b=integer.intValue();
        System.out.println(integer);
        System.out.println(b);
        System.out.println(in);
        String s="hello";
        String s2=new String("hello");
        s.intern();

    }
}
