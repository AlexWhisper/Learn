package com.alex.Iterator_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * @author Alex
 * @version 1.0
 */
public class iteration02 {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("三国演义", "罗贯中", 10.1));
        col.add(new Book("小李飞刀", "古龙", 5.1));
        col.add(new Book("红楼梦", "曹雪芹", 34.6));

        Iterator iterator = col.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

        System.out.println("==========使用增强for循环进行遍历======");
        for (Object o:
             col) {
            System.out.println(o);
        }


    }
}
class Book{
    private String name;
    private String author;
    private double price ;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}