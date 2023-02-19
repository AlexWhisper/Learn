package com.alex.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * @author Alex
 * @version 1.0
 */
public class list01 {
//    添加10个以上的元素（比如String"hello”),在2号位插入一个元素"韩顺平教
//    育“，
//    获得第5个元素，删除第6个元素，修改第7个元素，在使用迭代器遍历集
//    合，要求：使用List的实现类ArrayList完成。
    public static void main(String[] args) {
        List list=new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add("hello"+(i+1));
        }

        list.add(1,"韩顺平教育");
        Object o = list.get(4);
        list.remove(5);
        list.set(6,"alex");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
            
        }
    }
}

