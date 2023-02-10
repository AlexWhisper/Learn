package com.alex.collection_;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * @author Alex
 * @version 1.0
 */
public class collection01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("jack");
        arrayList.add(1);
        arrayList.add(true);
        System.out.println(arrayList);

        HashMap hashMap = new HashMap();
        hashMap.put("No1","Alex");
        hashMap.put("No2","小明");
        Object no1 = hashMap.get("No1");
        System.out.println(no1);

        System.out.println(hashMap);

    }
}
