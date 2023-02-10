package com.alex.math_;

/*
 * @author Alex
 * @version 1.0
 */
public class math01 {
    public static void main(String[] args) {
        //绝对值
        System.out.println(Math.abs(-10));
        //求幂
        System.out.println(Math.pow(2,3));
        //向上取整
        System.out.println(Math.ceil(2.3));
        //向下取整
        System.out.println(Math.floor(2.3));
        System.out.println(Math.round(2.45));//四舍五入
        System.out.println(Math.sqrt(9));//开方
        System.out.println(Math.random());//0-1随机数
        //如 a = 2, b=7之间随机数
        System.out.println(Math.random()+2);

    }
}
