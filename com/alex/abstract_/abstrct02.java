package com.alex.abstract_;
public class abstrct02 {
    public static void main(String[] args) {
        BBB bbb = new BBB();
        bbb.init();
        CCC ccc = new CCC();
        ccc.init();

    }

}

abstract class AAA{
    public abstract void hi();
    public void init(){
        System.out.println("你好啊");
        hi();
        System.out.println("介绍完毕");
    }

}
class BBB extends AAA{
    @Override
    public void hi() {
        System.out.println("我是BBB");
    }
}

class CCC extends AAA{
    @Override
    public void hi() {
        System.out.println("我是CCC");
    }
}

