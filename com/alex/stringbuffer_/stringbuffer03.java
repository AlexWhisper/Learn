package com.alex.stringbuffer_;

/*
 * @author Alex
 * @version 1.0
 */
public class stringbuffer03 {
    public static void main(String[] args) {
        String str=null;
//        StringBuffer stringBuffer = new StringBuffer(str);
        //构造器直接传入null会抛异常，append添加null不会异常
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        System.out.println(stringBuffer);

    }
}
