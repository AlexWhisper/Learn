package com.alex.exception_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * @author Alex
 * @version 1.0
 */
public class exception01 {
    public static void main(String[] args)  {

      int a=129;
      int b=129;
        System.out.println(a);
        Integer integer = new Integer(129);
        System.out.println(integer.equals(b));


    }
}


class AgeException extends RuntimeException{
    public AgeException(String message) {
        super(message);
    }
}