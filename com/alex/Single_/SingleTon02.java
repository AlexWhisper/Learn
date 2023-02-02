package com.alex.Single_;

public class SingleTon02 {
    public static void main(String[] args) {
        GrilFridend instance = GrilFridend.getInstance();
        System.out.println(instance);
    }


}
class GrilFridend{
    private String name;
    private static GrilFridend gf;

    private GrilFridend(String name) {
        this.name = name;
    }
    public static GrilFridend getInstance(){
        if(gf==null){
            gf=new GrilFridend("小花");
        }
        return gf;
    }

    @Override
    public String toString() {
        return "GrilFridend{" +
                "name='" + name + '\'' +
                '}';
    }
}
