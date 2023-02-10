package com.alex.Date_;

import java.util.Calendar;

/*
 * @author Alex
 * @version 1.0
 */
public class Calendar01 {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        System.out.println(instance.get(Calendar.YEAR));
        System.out.println(instance.get(Calendar.MONTH));

    }
}
