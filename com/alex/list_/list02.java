package com.alex.list_;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/*
 * @author Alex
 * @version 1.0
 */
public class list02 {
    //使用ArrayList实现Book的)按价格排序，从低到高（使用冒泡法）
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Book("三国演艺",100,"路人A"));
        arrayList.add(new Book("水壶新传",30,"路人B"));
        arrayList.add(new Book("红楼梦游",500,"路人C"));

        
        bubble(arrayList, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book b1=(Book) o1;
                Book b2=(Book) o2;
                return (int) (b1.getPrice()-b2.getPrice());
            }
        });

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

    }

    public static void bubble(ArrayList arrayList, Comparator c){
        for (int i = 0; i <arrayList.size()-1; i++) {
            for (int j = 0; j < arrayList.size()-1-i; j++) {
                if (c.compare(arrayList.get(j), arrayList.get(j + 1))>0){
                    Book temp= (Book) arrayList.get(j);
                    arrayList.set(j,arrayList.get(j+1));
                    arrayList.set(j+1,temp);
                }
                
            }

        }

    }
}
