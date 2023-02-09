package com.alex.exception_;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;

/*
 * @author Alex
 * @version 1.0
 */
public class test01 {
    public static void main(String[] args) {
        int[] a={1,3,2,4,0};

        int[] b={1,3,2,4,0};
        Arrays.sort(b);
        Arrays.sort(a);

        Calendar instance = Calendar.getInstance();
        System.out.println(instance);
        System.out.println(instance.get(Calendar.YEAR));
    }
}
