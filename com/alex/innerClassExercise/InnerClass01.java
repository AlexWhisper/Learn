package com.alex.innerClassExercise;

public class InnerClass01 {
    public static void main(String[] args) {
         
        wbl.nbl n = new wbl.nbl();
        n.hi();
    }
}
class wbl{
    static class nbl{
        void hi(){
            System.out.println("你好啊，这是一个成员");
        }
    }

}

