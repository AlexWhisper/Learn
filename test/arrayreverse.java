package test;

import java.sql.Array;

public class arrayreverse {
    public static void main(String[] args) {
        int[] arr={11,22,33,44,55,66,77,88};
        int[] arr2=new int[arr.length];

        for (int i=0;i<8;i++){
            arr2[i]=arr[arr.length-1-i];
        }
        for (int i=0;i<8;i++){
            System.out.println(arr2[i]);
        }
    }
}
