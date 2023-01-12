package com.alex.HouseRent.utils;

public class TestUtility {
    public static void main(String[] args) {
        String s=Utility.readString(3);
        System.out.println("s="+s);

        String s2=Utility.readString(10,"hspedu");
        System.out.println("s2="+s2);

    }
}
