package package1;

public class test {
    public static void main(String[] args) {
        A a=new A();

        System.out.println(a.a1+a.a2+a.a3); //同一个包下，不同类中不能访问private
    }
}
class A{
    public String a1="a1";
    String a2="a2";
    protected String a3="a3";
    private String a4="a4";
    public void b1(){}
    void b2(){}
    protected void b3(){}
    private void b4(){}

    public void c(){
        System.out.println(a1+a2+a3+a4);//在同一个类中，所有修饰符都可以访问
    }
}
