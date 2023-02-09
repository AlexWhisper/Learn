package com.alex.stringbuffer_;

/*
 * @author Alex
 * @version 1.0
 */
public class stringbuffer04 {
    public static void main(String[] args) {
        String price="8123564.59";
        StringBuffer s1 = new StringBuffer(price);
        System.out.println(s1.indexOf("."));


        for (int i = s1.indexOf("."); i >=3; i-=3) {
            s1.insert(i-3,",");

        }
        System.out.println(s1);
    }
}
