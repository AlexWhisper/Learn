package com.alex.annotation_;

/*
 * @author Alex
 * @version 1.0
 */
public class Homework02 {

}
class Frock{
    private static int currentNum=100000;
    private int serialNumber;

    public Frock() {
        serialNumber=getNextNum();

    }

    public int getSerialNumber(){
        return serialNumber;
    }
    public static  int getNextNum(){
        currentNum+=100;
        return currentNum;
    }
}
class TestFrock{
    public static void main(String[] args) {
        Frock frock = new Frock();
        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        System.out.println(frock.getSerialNumber());
        System.out.println(frock1.getSerialNumber());
        System.out.println(frock2.getSerialNumber());


    }
}
