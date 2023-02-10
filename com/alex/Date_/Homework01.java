package com.alex.Date_;

/*
 * @author Alex
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
//        (1)将字符串中指定部分进行反转。比如将"abcdef"反转为"aedcbf"
//        (2)编写方法public static String reverse(String str,.int start,int end搞定
        String str="abcdef";
        System.out.println(reverse(str,1,4).toString());
    }
    public static String reverse(String str,int start,int end){
        char[] chars = str.toCharArray();
        int charLength=chars.length;
        for (int i = start,j=end; i < j; i++,j--) {
            char temp = chars[i];
            chars[i]=chars[j];
            chars[j]=temp;

        }
//        for (char i :
//                chars) {
//            System.out.println(i);
//        }
        String s = new String(chars);

        return s;
    }


}
