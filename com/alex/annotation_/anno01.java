//package com.alex.annotation_;
//
//import com.sun.org.glassfish.gmbal.Description;
//
///*
// * @author Alex
// * @version 1.0
// */
//public class anno01 {
////    @SuppressWarnings("all")
//    @SuppressWarnings({"unused"})
//    public static void main(String[] args) {
//        Teacher teacher = new Teacher();
//        int a;
//        teacher.hey();
//        System.out.println(teacher.name);
//
//    }
//}
//class Person{
//    void hi(){
//        System.out.println("父类hi");
//    }
//}
//class Teacher extends Person{
//    @Deprecated
//    String name="小明";
//    @Override
//    void hi(){
//        System.out.println("子类hi");
//    }
////    @Override //没有重写父类方法，使用Override会报错
//    @Deprecated //表示hey方法已经过时了，可用但是不建议
//    void hey(){
//        System.out.println("子类hey");
//    }
//
//
//}