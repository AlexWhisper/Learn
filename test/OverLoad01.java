package test;

public class OverLoad01 {
    public static void main(String[] args) {
        Object ob1=new Object();
        int n1=ob1.calculator(2,3);
        double n2=ob1.calculator(3.0,4);
        double n3=ob1.calculator(5.0,3);
        int n4=ob1.calculator(5,6,7);
        System.out.println("n1="+n1+"\tn2="+n2+"\tn3="+n3+"\tn4="+n4);
    }
}
class Object{
    public int calculator(int n1,int n2){
        return n1+n2;
    }
    public double calculator(int n1,double n2){
        return n1+n2;
    }
    public double calculator(double n1,int n2){
        return n1+n2;
    }
    public int calculator(int n1,int n2,int n3){
        return n1+n2+n3;
    }
}

