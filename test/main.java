package test;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class main {
    static class cat{
        String name;
        int age;
        String color;

        public void action(){
            System.out.println("喵喵喵");
        }
    }

    public static void  main(String[] args) {
        cat c1=new cat();
        c1.name="小白";
        c1.age=2;
        c1.color="黑色";
        System.out.println(c1.name);
        System.out.println(c1.age);
        System.out.println(c1.color);

        c1.action();

        cat c2=new cat();
        c1.name="小黑";
        c1.age=3;
        c1.color="白色";
        System.out.println(c1.name);
        System.out.println(c1.age);
        System.out.println(c1.color);

        c1.action();
    }

}
