package test;

public class Homework01 {
    public static void main(String[] args) {
        double[] arr={11,2,55,12,7,23,99,23};
        A01 a=new A01();
        System.out.println(a.max(arr));

    }
}
class A01{

    public A01(){

    }
    public double max(double[] arr){
        double res=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>res) res=arr[i];
        }
        return res;
    }
}
