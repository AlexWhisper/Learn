package test;
import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;
public class inputdemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next(); //字符串用 对象.next()接收
        int age=sc.nextInt(); //整形用 对象.nextInt()接收
        double sal =sc.nextDouble(); //double用 对象.nextDouble()接收

        System.out.println(name+"\t"+age+"\t"+sal);

    }
}
