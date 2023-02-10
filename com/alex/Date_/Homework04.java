package com.alex.Date_;

import java.util.List;

/*
 * @author Alex
 * @version 1.0
 */
public class Homework04 {
//    输入字符串，判断里面有多少个大写字母，
//    多少个小写字母，多少个数字
    public static void main(String[] args) {
        String str="sfaFFFA331231233@";
        int upperCount=0,lowerCount=0,numCount=0,other=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)<='9'&&str.charAt(i)>='0'){
                numCount++;
            } else if (str.charAt(i) <= 'z' && str.charAt(i) >= 'a') {
                lowerCount++;
            } else if (str.charAt(i) <= 'Z' && str.charAt(i) >= 'A') {
                upperCount++;
            }else {
                other++;
            }

        }
        System.out.println(upperCount);
        System.out.println(lowerCount);
        System.out.println(numCount);
        System.out.println(other);


    }
}
