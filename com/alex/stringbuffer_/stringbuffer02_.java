package com.alex.stringbuffer_;

/*
 * @author Alex
 * @version 1.0
 */
public class stringbuffer02_ {

    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("hello");
        //增
        s.append(",");

        s.append("nihao").append("haha");
        System.out.println(s);

        //删
        s.delete(0,6);
        System.out.println(s);
        s.replace(0,2,"你好");
        System.out.println(s);
        int ha = s.indexOf("ha");
        System.out.println(ha);
        int ha1 = s.lastIndexOf("ha");
        System.out.println(ha1);
        s.insert(2,"=");
        System.out.println(s);
        System.out.println(s.length());


    }
}
