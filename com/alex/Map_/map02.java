package com.alex.Map_;

import java.util.*;

public class map02 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("邓超", "孙俪");
        map.put("王宝强", "马蓉");
        map.put("宋喆", "马蓉");
        map.put("刘令博", null);
        map.put(null, "刘亦菲");
        map.put("鹿晗", "关晓彤");
        
        


        //第一组，先取出所有的key，然后get方法，获得所有的Value
        Set keySet = map.keySet();
        System.out.println("===使用增强for循环遍历keySet数组，取出key，依次放入get参数===");
        //使用增强for
        for (Object key :
                keySet) {
            System.out.println(map.get(key));
        }

        //使用迭代器
        System.out.println("===使用keySet的迭代器，遍历所有key===");
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println(map.get(key));
        }


        //把所有的values取出
        //使用增强for
        Collection values = map.values();
        System.out.println("===使用增强for循环输出所有的value====");
        for (Object value :
                values) {
            System.out.println(value);
        }

        //使用迭代器遍历values
        System.out.println("使用迭代器循环遍历values集合");
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object value = iterator1.next();
            System.out.println(value);
        }



        //第三组：通过EntrySet来获取k-v
        System.out.println("通过EntrySet实体来获取k-v");
        Set entrySet = map.entrySet();//这是一个entry集合，集合中每个元素都是一个entry，entry提供了getkey和getvalue方法
        //使用增强for
        System.out.println("===使用增强for===");
        for (Object entry :
                entrySet) {
            Map.Entry entry1 = (Map.Entry) entry;
            System.out.println(entry1.getKey()+"-"+entry1.getValue());
        }

        //使用迭代器
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Object entry =  iterator2.next();
            Map.Entry m=(Map.Entry)entry;
            System.out.println(m.getKey()+"="+m.getValue());

        }

    }
}
