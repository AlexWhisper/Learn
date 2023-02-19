package com.alex.Map_;

import java.util.Properties;

public class properties01 {
    public static void main(String[] args) {

        Properties properties = new Properties();
//properties.put(null, "abc");//抛出 空指针异常
//properties.put("abc", null); //抛出 空指针异常
        properties.put("john", 100);//k-v
        properties.put("lucy", 100);
        properties.put("lic", 100);
        properties.put("lic", 88);//如果有相同的 key ， value 被替换
        System.out.println("properties=" + properties);
        //通过get方式获取对应value
        System.out.println(properties.get("lic"));
        //删除操作
        properties.remove("lic");
        System.out.println(properties);

        //修改操作，直接用put实现
        properties.put("john","约翰");
        System.out.println(properties);
    }
}
