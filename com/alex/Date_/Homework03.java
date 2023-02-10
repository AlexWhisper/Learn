package com.alex.Date_;

/*
 * @author Alex
 * @version 1.0
 */
public class Homework03 {
//    (1)编写java程序，输入形式为：Han shun Ping的人名，以Ping,Han.S的形式打印
//    出来。其中S是中间单词的首字母。
//    (2)例如输入"Willian Jefferson Clinton”,输出形式为：Clinton,Willian.J
    public static void main(String[] args) {
        String name="Willian Jefferson Clinton";
        String[] s = name.split(" ");
        StringBuffer sb = new StringBuffer();
        sb.append(s[2]).append(",").append(s[0]).append(".").append(s[1].toUpperCase().charAt(0));
        System.out.println(sb);


    }
}
