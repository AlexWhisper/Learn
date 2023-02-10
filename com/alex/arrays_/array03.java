package com.alex.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/*
 * @author Alex
 * @version 1.0
 */
public class array03 {
    public static void main(String[] args) {
        Book[]books =new Book[4];
        books[0]=new Book("红楼梦",100);
        books[1]=new Book("新金瓶梅",90);
        books[2]=new Book("读者",5);
        books[3]=new Book("java从入门到放弃",300);
        //按照价格排序
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                double flag=o1.getPrice()-o2.getPrice();
                if (flag>0){
                    return 1;
                }else if(flag==0){
                    return 0;
                }else
                    return -1;
            }
        });
        for (Book n:books) {
            System.out.println(n);
        }

        //按照书名长度进行降序
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                int flag = o1.getName().length() - o2.getName().length();
                if (flag>0){
                    return 1;
                }else if(flag==0){
                    return 0;
                }else
                    return -1;
            }

        });
        for (Book n:books) {
            System.out.println(n);
        }
    }
}
class Book{
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
