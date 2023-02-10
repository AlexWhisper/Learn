package com.alex.BigInteger_;

import java.math.BigInteger;

/*
 * @author Alex
 * @version 1.0
 */
public class biginteger01 {
    public static void main(String[] args) {
//        long num=12312312312312312312312;
        BigInteger b1 = new BigInteger("12312312312312312312312");
        System.out.println(b1);
        b1=b1.add(new BigInteger("312"));
        System.out.println(b1);
        b1=b1.subtract(new BigInteger("312"));
        System.out.println(b1);
        b1=b1.multiply(new BigInteger("10"));
        System.out.println(b1);
        b1=b1.divide(new BigInteger("10"));
        System.out.println(b1);

    }
}
