package com.alex.interface_;

public class Interface06 {
    public static void main(String[] args) {
        IG ig=new Teacher();
        IH ih=new Teacher();
    }
}
interface IH{}
interface IG extends IH{}
class Teacher implements IG{
}
