package com.alex.string_;

/*
 * @author Alex
 * @version 1.0
 */
public class String01_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        /*
        equals/区分大小写，判断内容是否相等
        equalslgnoreCase/忽略大小写的判断内容是否相等
        length/获取字符的个数，字符串的长度
        indexOf/获取字符在字符串中第1次出现的索引，索引从0开始，如果找不到，返回-1
        lastIndexOf/获取字符在字符串中最后1次出现的索引，索引从0开始，如找不到，返回-1
        substring/截取指定范围的子串
        trim/去前后空格
        charAt获取某索引处的字符，注意不能使用Str[index]这种方式.
         */
        String a=" hello";
        String b="hellO";
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a.length());
        System.out.println(a.indexOf("l"));
        System.out.println(a.lastIndexOf("l"));
        System.out.println(a.substring(2,4));
        System.out.println(a.trim());
        System.out.println(a.charAt(3));

        /*
        toUpperCase 转大写
        toLowerCase 转小写
        concat 字符串的连接
        replace替换字符串中的字符
        split分割字符串，对于某些分割字符，我们需要转义比如等 案例：String poem="锄禾日当午，汗滴禾下土，谁知盘中餐，粒粒皆辛苦"：和文件路径
        compareTo/比较两个字符串的大小
        toCharArray/转换成字符数组
        format/格式字符串，%s字符串%c字符%d整型%.2f浮点型
         */
        System.out.println(a.toUpperCase());
        String c="HELLo";
        System.out.println(c.toLowerCase());
        System.out.println(c.concat(a));
        System.out.println(c.replace("HE","ll"));
        String name="tom J Simplsion";
        System.out.println(name.split(" "));
        String[] split = name.split(" ");
        for (String i:split){
            System.out.println(i);
        }

        System.out.println(c.compareTo(c.toUpperCase()));
        System.out.println(c.toCharArray());
        char[] chars = c.toCharArray();
        for (char i:chars){
            System.out.println(i);
        }


    }
}
