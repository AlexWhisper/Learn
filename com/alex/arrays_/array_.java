package com.alex.arrays_;

import sun.plugin.javascript.navig.Array;

import java.util.Arrays;
import java.util.List;

/*
 * @author Alex
 * @version 1.0
 */
public class array_ {
    public static void main(String[] args) {
        int[] a={11,23,10,22,30,59,21};
        System.out.println(Arrays.toString(a));

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int i = Arrays.binarySearch(a, 10);
        System.out.println(i);
        int[] ints = Arrays.copyOf(a, 10);
        System.out.println(Arrays.toString(ints));
        Arrays.fill(ints,0);
        System.out.println(Arrays.toString(ints));
        List<int[]> ints1 = Arrays.asList(ints);

    }
}
