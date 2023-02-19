package com.alex.list_;

import java.util.Iterator;
import java.util.LinkedList;

public class list07 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);

        //删除一个结点
        linkedList.remove(2);
        System.out.println(linkedList);

        //replace一个结点
        linkedList.set(1,999);
        System.out.println(linkedList);

        //get一个结点
        Object o = linkedList.get(1);
        System.out.println(o);


        linkedList.add("jack");
        linkedList.add("tom");

        //linkedList实现了List接口，所以也可以使用LIst的遍历方式三中，迭代器，普通for循环，增强for循环
        //使用迭代器遍历linkedlist
        Iterator iterator = linkedList.iterator();
        System.out.println("==========这里使用的迭代器进行遍历=========");
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

        //使用普通for循环进行遍历
        System.out.println("===========这里使用的是普通for循环进行遍历=============");

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        //使用增强for循环进行遍历
        System.out.println("===========这里使用的是增强for循环进行遍历=============");
        for (Object o1 :
                linkedList) {
            System.out.println(o1);
        }

        linkedList.remove();



    }
}
