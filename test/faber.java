package test;

public class faber {
    public static void main(String[] args) {
        fun f=new fun();
        for (int i=0;i<100;i++){
            System.out.println(f.start(i)+" ");
        }
    }
}

class fun{
    public int start(int n){
        if(n==1||n==0) return 1;
        else return start(n-1)+start(n-2);
    }
}

