package com.alex.enum_;

/*
 * @author Alex
 * @version 1.0
 */
public class EnumExercise02 {
    public static void main(String[] args) {
        Week[] values = Week.values();
        System.out.println("====所有星期信息如下====");
        for (Week w:values){

            System.out.println(w.toString());
        }
        Music.Popmusic.play();
    }

}
enum Week{
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SARTUDAY("星期六"),
    SUNDAY("星期日");
    private String name;

    //public static final Week SUNDAY=new Week("xxx")
    private Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

interface IP{
    void play();
}
enum Music implements IP{
    Popmusic
    ;
    public void play(){
        System.out.println("播放音乐");
    }
}