package com.alex.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/*
 * @author Alex
 * @version 1.0
 */
public class array02 {
    public static void main(String[] args) {
        int[] arr = {1, -1, 8, 0, 20};
        int[] arr2 = {1, -1, 8, 0, 20};
        int[] arr3 = {1, -1, 8, 0, 20};



        bubble(arr); //传统排序
        System.out.println(Arrays.toString(arr));
        bubble02(arr2, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int a=(int) o1;
                int b=(int) 02;
                return a-b;
            }
        });
        System.out.println(Arrays.toString(arr));

    }

    private static void bubble02(int[] arr,Comparator c) {
        int temp=0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (c.compare(arr[j],arr[j+1])>0){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    private static void bubble(int[] arr) {
        int temp=0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                
            }
        }
    }


}

