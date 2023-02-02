package com.alex.final_;

public class Final01 {
    public static void main(String[] args) {
        BBB bbb = new BBB();
        System.out.println(bbb.name);
        //bbb.name="23";// bbb的类属性name被final关键字修饰，无法在修改
    }
}
 class AAA {
    final String name="12312";
     {
//         name="123";//
     }
     public final void  hi(){

     }

}
class BBB extends AAA{ //AAA若被final 修饰导致无法被继承
    final String name="123";//子类重写name可以修改
    final int TAX_SF_AGE1=12;
    final int TAX_SF_AGE2;
    final int TAX_SF_AGE3;
    final static int TAX_SF_AGE4;
    static {
        TAX_SF_AGE4=1;
    }
    {
        TAX_SF_AGE3=3;
    }

    public BBB() {
        TAX_SF_AGE2=2;
    }
//    @Override
//    public void hi() { //若AAA类中的hi方法被final关键字修饰 将导致子类无法重写hi方法

//        System.out.println("hi");
//    }
    public void bcd(){
        final int age=123;
//        age=12; //final 关键字被修饰
    }
}

