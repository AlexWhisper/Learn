package com.alex.Date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.DataFormatException;

/*
 * @author Alex
 * @version 1.0
 */
public class date01 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        String res = simpleDateFormat.format(date);
        System.out.println(res);

        String s = "1996 年 01 月 01 日 10:20:30 星期一";
        Date parse = simpleDateFormat.parse(s);
        System.out.println(simpleDateFormat.format(parse));

    }
}
