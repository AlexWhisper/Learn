package test;

public class Homeword13 {
    public static void main(String[] args) {
        PassObject po=new PassObject();
        Circle2 c1=new Circle2();
        po.printAreas(c1,5);

    }
}
class Circle2{
    double radius;

    public double findArea(double radius){
        return 3.14*radius*radius;
    }

}
class PassObject{

    public void printAreas(Circle2 c,int times){
        System.out.println("Radius\t\tArea");
        for (int i=0;i<=times;i++){
            System.out.println(i+"\t\t"+c.findArea(i));
        }
    }
}

