package com.alex.Date_;

import java.rmi.registry.Registry;

/*
 * @author Alex
 * @version 1.0
 */
public class Homework02 {
    //    输入用户名、密码、邮箱，如果信息录入正确，则提示注册成功，否则生成异常对象
//    要求：
//            (1)用户名长度为2或3或4
//            (②)密码的长度为6，要求全是数字isDigital
//            (3)邮箱中包含@和.并且@在.的前面
    public static void main(String[] args) {
        String name = "Alex00000";
        String passwd = "1232000";
        String email = "1233@qq.com000";
        RegistVerify(name,passwd,email);



    }

    static void RegistVerify(String name,
                             String passwd,
                             String email) {
        if (!(name.length()>=2&&name.length()<=4)){
            throw new RuntimeException("用户名格式错误");
        }
        if (!(passwd.length()==6&&isDigital(passwd))) {
            throw new RuntimeException("密码格式错误");
        }
        int indexAt = email.indexOf("@");
        int indexdot = email.indexOf(".");
        if (!(indexAt !=-1&& indexdot !=-1&&indexAt<indexdot)){
            throw new RuntimeException("邮箱格式错误");
        }
        System.out.println("注册成功");
    }

    private static boolean isDigital(String passwd) {
        for (int i = 0; i < passwd.length(); i++) {
            if (!(passwd.charAt(i)>='0'&&passwd.charAt(i)<='9')){
                return false;
            }
        }
        return true;
    }

}
