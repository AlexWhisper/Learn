package com.alex.enum_;

/*
 * @author Alex
 * @version 1.0
 */
public class Enumeration03 {
    public static void main(String[] args) {
        Season2 autumn = Season2.AUTUMN;
        System.out.println(autumn.toString());
        System.out.println(autumn.name());
        System.out.println(autumn.ordinal());
        Season2[] items=Season2.values();
        for (Season2 n:items){
            System.out.println(n.name());
        }
        Season2 autumn1 = Season2.valueOf("AUTUMN");
        System.out.println(autumn1==autumn);
//        Season2 s=Season2.valueOf("春天");//报错
        System.out.println(autumn1.compareTo(autumn));
        

    }
}

