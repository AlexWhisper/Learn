package com.alex.Set_;

import java.util.Comparator;
import java.util.TreeMap;

public class treemap01 {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap();
        treeMap.put("jack", "杰克");
        treeMap.put("tom", "汤姆");
        treeMap.put("kristina", "克瑞斯提诺");
        treeMap.put("smith", "斯密斯");
        treeMap.put("hsp", "韩顺平");
        System.out.println(treeMap);
        TreeMap treeMap1 = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length()-((String)o2).length();
            }
        });
        treeMap1.put("jack", "杰克");
        treeMap1.put("tom", "汤姆");
        treeMap1.put("kristina", "克瑞斯提诺");
        treeMap1.put("smith", "斯密斯");
        treeMap1.put("hsp", "韩顺平");
        System.out.println(treeMap1);
    }
}
