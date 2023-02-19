package com.alex.Map_;

import com.alex.list_.Dog;

import java.util.HashMap;

public class map01 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("no1","alex");
        hashMap.put("no2","tom");
        hashMap.put("no3","jack");

        hashMap.put(null,null);
        hashMap.put(null,"无");

        hashMap.put("no3","小明");

        Dog yeller = new Dog("yeller");

        hashMap.put(yeller,"这是大黄");

        System.out.println("no1"+hashMap.get("no1"));
        System.out.println("no2"+hashMap.get("no2"));
        System.out.println("no3"+hashMap.get("no3"));
        System.out.println("null"+hashMap.get(null));

        System.out.println("这个是："+hashMap.get(yeller));




    }
}
class Car{
    static String name="hello";


}