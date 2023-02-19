package com.alex.list_;


import com.sun.xml.internal.bind.marshaller.NoEscapeHandler;

import java.util.LinkedList;

public class list06 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("jack");
        linkedList.add("alex");
        linkedList.add("tom");
        linkedList.add("lisa");
        System.out.println(linkedList);

        Node jack = new Node("jack");
        Node alex = new Node("alex");
        Node tom = new Node("tom");
        Node lisa = new Node("lisa");

        jack.next=alex;
        alex.next=tom;
        tom.next=lisa;
        lisa.next=null;
        jack.pre=null;
        alex.pre=jack;
        tom.pre=alex;
        lisa.pre=tom;

        Node first=jack;
        Node last=lisa;
        System.out.println("======从头到尾进行遍历==========");
        while(true){
            if(first==null){
                break;
            }

            System.out.println(first.item);
            first=first.next;
        }
        System.out.println("========从尾到头的遍历============");
        while(true){
            if(last==null){
                break;
            }

            System.out.println(last.item);
            last=last.pre;
        }

        //演示链表的添加对象数据 在alex后面添加一个结点名字叫做tony
        Node tony = new Node("tony");
        tony.pre=alex;
        tony.next=tom;
        alex.next=tony;
        tom.pre=tony;

        first=jack;
        last=lisa;
        System.out.println("======从头到尾进行遍历==========");
        while(true){
            if(first==null){
                break;
            }

            System.out.println(first.item);
            first=first.next;
        }

    }

}
class Node{
    public Object item;
    public Node next;
    public Node pre;

    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node name=" + item;
    }
}