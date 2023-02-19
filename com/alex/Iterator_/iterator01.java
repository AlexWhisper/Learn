package com.alex.Iterator_;

import sun.plugin.javascript.navig.Array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * @author Alex
 * @version 1.0
 */
public class iterator01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("三国演绎");
        list.add("水浒后传");
        list.add("嘻哈游记");
        list.add("红楼梦想");
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
        System.out.println("itit生成============");
        iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();

            System.out.println(next);
        }

        System.out.println("======使用增强for循环=========");
        for (Object o:list) {
            System.out.println(o);
        }

    }
}
