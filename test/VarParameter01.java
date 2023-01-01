package test;

public class VarParameter01 {
    public static void main(String[] args) {
        HspMethod01 hsp=new HspMethod01();
        System.out.println(hsp.sum(1,2,3,4,5,6,7,8,9,10));

    }
}
class HspMethod01 {
    public int sum(int...nums){
        int res=0;
        for (int i=0;i<nums.length;i++){
            res+=nums[i];
        }
        return res;
    }
}
