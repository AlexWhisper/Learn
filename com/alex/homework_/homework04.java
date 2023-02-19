package com.alex.homework_;

public class homework04 {
    public static void main(String[] args) {
        /*
        分析HashSet和TreeSet分别如何实现去重
        HashSet去重机制：HahsCode+equals方法，底层先通过存入对象，再进行运算得到一个hash值，通过hash值获得对应的索引，如果发现table素偶姻所在位置没有
        就直接存放，如果有就对比equals比较，遍历比较，如果比较后不相同，就加入，如果相同就不加入

        TreeSet的去重机制：如果传入一个COmparator匿名对象，就是用实现的compare去重，如果方法返回是0，就认为是相同元素就不添加
        如果没有传入一个comparator匿名对象，则以你添加的对象实现的Compareable接口的Comparato去比较

         */
    }
}
