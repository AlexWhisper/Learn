package com.alex.enum_;

import com.sun.org.apache.bcel.internal.generic.NEW;

/*
 * @author Alex
 * @version 1.0
 */
public class Enumeration02 {
    public static void main(String[] args) {
//        Season spring = new Season("春天", "温暖");
//        System.out.println(spring.toString());
        System.out.println(Season.AUTUMN);
        System.out.println(Season.WINTER);

    }

}

enum Season2 {

    SPRING("春天","温暖"),
    SUMMER("夏天","炎热"),
    AUTUMN("秋天","凉爽"),
    WINTER("冬天","寒冷"),wucan,what();
    private String name;
    private String description;

//    public static final Season SPRING= new Season("春天","温暖");
//    public static final Season SUMMER= new Season("夏天","炎热");
//    public static final Season AUTUMN= new Season("秋天","凉爽");
//    public static final Season WINTER= new Season("冬天","寒冷");

    private Season2() {
        //一个无参构造器

    }

    private Season2(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}