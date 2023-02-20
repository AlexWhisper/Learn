package leetcode;

import java.util.Arrays;

/*
 * @author Alex
 * @version 1.0
 */
public class _array01 {
    public static void main(String[] args) {
        int[] ints = {0,1,0,3,12};
        moveZeroes(ints);
        for (int i :
                ints) {
            System.out.println(i);
        }
    }
    public static void  moveZeroes(int[] nums) {
        int[] res=new int[nums.length];
        int i=0,j=0;
        while (i<j){
            if (nums[i]!=0){
                i++;
            }
            if (nums[j]==0){
                j++;
            }
            if(i<j){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;

            }
        }

    }
}
