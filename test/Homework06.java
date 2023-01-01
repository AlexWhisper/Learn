package test;

public class Homework06 {
    public static void main(String[] args) {
        System.out.println();
        Cale cal=new Cale(2,3);
        Cale cal2=new Cale(4,8);
        cal.he();
        cal.cha();
        cal2.he();
        cal2.cha();
    }
}

class Cale{
    double a;
    double b;
    public Cale(double a,double b){
        this.a=a;
        this.b=b;

    }
    public void he(){
        System.out.println(a+b);
    }
    public void cha(){
        System.out.println(a-b);
    }
    public void ji(){
        System.out.println(a*b);
    }
    public void shang(){
        if (b==0){
            System.out.println("除数不可以为0");
        }else
        System.out.println(a/b);
    }
}

