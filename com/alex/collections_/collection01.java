package com.alex.collections_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class collection01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("tom");
        list.add("smith");
        list.add("king");
        list.add("milan");
        list.add("tom");

        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.shuffle(list);//随机排序
        Collections.sort(list);

        Collections.sort(list, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o2).length() - ((String) o1).length();
            }
        });

        System.out.println(list);

        Collections.swap(list,0,1);
        Collections.max(list);
    }
}
