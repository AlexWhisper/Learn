package test;

public class monkeyEatPeach {
    public static void main(String[] args) {
        Monkey m=new Monkey();
        int sum=m.eat(1);
        System.out.println(sum);
    }
}
class Monkey{
    public int eat(int day){
        if(day==10){
            return 1;
        }else return (eat(day+1)+1)*2;
        //(n/2-1)/2-1
    }
}
