package com.alex.Map_;

import java.util.Hashtable;
import java.util.Set;

public class hashtble01 {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("邓超", "孙俪");
        hashtable.put("王宝强", "马蓉");
        hashtable.put("宋喆", "马蓉");
//        hashtable.put("刘令博", null);//错误
//        hashtable.put(null, "刘亦菲");//错误
        hashtable.put("鹿晗", "关晓彤");
        hashtable.put("邓超","张三");//错误

        Set keySet = hashtable.keySet();
        System.out.println(hashtable.get("邓超"));

    }
}
