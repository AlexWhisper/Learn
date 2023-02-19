package com.alex.collection_;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/*
 * @author Alex
 * @version 1.0
 */
public class collectionMethod {
    public static void main(String[] args) {
         List list= new ArrayList();
         list.add("jack");
         list.add(10);
         list.add(true);

        list.remove(2);
        System.out.println("list="+list);
        list.remove("10");
        System.out.println("list="+list);
        System.out.println(list.contains("jack"));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.isEmpty());
        List arr=new ArrayList();
        arr.add("三国志");
        arr.add("水浒传");
        list.addAll(arr);




    }

}
