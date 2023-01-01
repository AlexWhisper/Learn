package test;

public class MethodExerse01 {
    public static void main(String args[]){
        AA a=new AA();
        int n=9;

        System.out.println(a.isodd(n));

        a.print(10,3,'#');
    }
}
class AA {
    public boolean isodd(int n) {
        return n % 2 != 0;
    }
    public void print(int row,int col,char n){
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(n);
            }
            System.out.println();
        }
    }
}

