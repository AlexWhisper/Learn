package com.alex.file_;

import java.io.*;
import java.util.Properties;

public class properties02 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new BufferedInputStream(new FileInputStream("D:\\mysql.properties")));
        System.out.println(properties.getProperty("user")); //通过properties对象的getProperty方法来获得对应的key的value值

        properties.list(System.out); //通过properties的list方法来输出所有的key和value 需要传入一个参数，这个参数是一个输出流，这里我使用的是标准输出的System.out



        properties.setProperty("user","alex"); //通过properties的setProperty方法来设置一个设置一个key和value，如果key已经存在则会替换对应的value
        properties.list(System.out); //通过properties的list方法来输出所有的key和value 需要传入一个参数，这个参数是一个输出流，这里我使用的是标准输出的System.out

        properties.store(new BufferedOutputStream(new FileOutputStream("D:\\mysql.properties")),""); //通过properties的store方法来将properties对象中的key和value写入到文件中，需要传入两个参数，第一个参数是一个输出流，第二个参数是一个注释，这里我使用的是标准输出的System.out，第二个参数我传入的是一个空字符串，这样就不会在文件中写入注释了





    }
}
