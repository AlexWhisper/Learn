package test;

public class HanoiTower {
    public static void main(String[] args) {
        tower t=new tower();
        t.move(5,'A','B','C');
    }
}

class tower{
    public void move(int n,char a,char b,char c){  //从a移动到c，借助b
        if(n==1) {
            System.out.println(a + "->" + c);
        }else{
            move(n-1,a,c,b);
            System.out.println(a+"->"+c);
            move(n-1,b,a,c);
        }
    }
}