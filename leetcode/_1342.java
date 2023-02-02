package leetcode;

import javax.print.attribute.standard.NumberOfDocuments;

public class _1342 {
    public static int numberOfSteps(int num) {
        int count=0;
        while(num!=0){
            count++;
            if(num%2==0){

                //System.out.println("步骤 "+count+")"+num+"数字是偶数，除以2得"+num/2);
                num/=2;
            }else {
                //System.out.println("步骤 "+count+")"+num+"数字是奇数，减去1得"+--num);
                --num;
            }
        }
        return count;
    }

    public static void main(String[] args) {
         numberOfSteps(14);

    }
}
