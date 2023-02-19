package com.alex.list_;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Vector;


/*
 * @author Alex
 * @version 1.0
 */

public class list03 {
    // //使用Vector实现Book的按价格排序，从低到高（使用冒泡法）
    public static void main(String[] args) {
        Vector vector= new Vector();
        vector.add(new Book("三国演艺",100,"路人A"));
        vector.add(new Book("水壶新传",30,"路人B"));
        vector.add(new Book("红楼梦游",500,"路人C"));

        bubble02(vector, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book b1=(Book) o1;
                Book b2=(Book) o2;
                if (b1.getPrice()>b2.getPrice())
                    return 1;
                else if(b1.getPrice()<b2.getPrice()){
                    return -1;
                }else return 0;
            }
        });

        for (Object o:vector
             ) {
            System.out.println(o);
        }

    }

    public static void bubble02(Vector v, Comparator c){
        for (int i = 0; i <v.size()-1; i++) {
            for (int j = 0; j < v.size()-1-i; j++) {
                if (c.compare(v.get(j),v.get(j+1))>0){
                    Object o = v.get(j);
                    v.set(j,v.get(j+1));
                    v.set(j+1,o);
                }
                
            }
            
        }
    }
}
