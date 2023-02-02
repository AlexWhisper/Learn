package com.alex.test;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr={11,33,77,22,88,99,44,66,55};
        int temp=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
