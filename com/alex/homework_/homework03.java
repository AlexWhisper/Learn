package com.alex.homework_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class homework03 {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("jack",650);
        m.put("tom",1200);
        m.put("smith",2900);
        System.out.println(m);

        m.put("jack",2600);
        System.out.println(m);

        Set keySet = m.keySet();
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            m.put(key,(int)m.get(key)+100);
        }

        System.out.println(m);

        for (Object o :
                keySet) {
            System.out.println(o);
        }for (Object o :
                keySet) {
            System.out.println(m.get(o));
        }

    }
}
