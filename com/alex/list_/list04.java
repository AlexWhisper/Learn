package com.alex.list_;

import sun.awt.image.ImageWatched;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Vector;

/*
 * @author Alex
 * @version 1.0
 */
public class list04 {
    //LinkedList 实现了 Book的输出
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(new Book("三国演艺",100,"路人A"));
        linkedList.add(new Book("水壶新传",30,"路人B"));
        linkedList.add(new Book("红楼梦游",500,"路人C"));

        bubble3(linkedList, new Comparator() {
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

        for (Object b :
                linkedList) {
            System.out.println(b);
        }

    }
    public static void bubble3(LinkedList l, Comparator c){

        for (int i = 0; i < l.size()-1; i++) {
            for (int j = 0; j < l.size()-1-i; j++) {
                if (c.compare(l.get(j),l.get(j+1))>0){
                    Book b = (Book) l.get(j);
                    l.set(j,l.get(j+1));
                    l.set(j+1,b);
                }

            }
            
        }

    }
}
