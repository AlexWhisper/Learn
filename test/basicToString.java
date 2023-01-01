package test;

public class basicToString {
    public static void main(String[] args) {
        int n1=100;
        float f1=1.1F;
        double d1=4.5;
        boolean b1 =true;
        String s1=n1+"";
        System.out.println(s1);

        int n2=Integer.parseInt(s1);
        double d2=Double.parseDouble(s1);
        boolean b2 =Boolean.parseBoolean(s1);
        short short2=Short.parseShort(s1);
        long l2=Long.parseLong(s1);
        byte b3=Byte.parseByte(s1);
    }
}
