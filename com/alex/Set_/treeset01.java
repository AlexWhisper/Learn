package com.alex.Set_;

import sun.reflect.generics.tree.Tree;

import java.util.Comparator;
import java.util.TreeSet;

public class treeset01 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add("tom");
        treeSet.add("jack");
        treeSet.add("Alexdra");
        treeSet.add("Li");

        System.out.println(treeSet);

        TreeSet treeSet1 = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).compareTo(((String) o2));
//                return ((String) o2).length()-((String) o1).length();
            }
        });
        treeSet1.add("tom");
        treeSet1.add("jack");
        treeSet1.add("Alexdra");
        treeSet1.add("Li");

        System.out.println(treeSet1);
        


    }
}
