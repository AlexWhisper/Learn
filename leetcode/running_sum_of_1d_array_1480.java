package leetcode;

public class running_sum_of_1d_array_1480 {
    public int[] runningSum(int[] nums) {
        int[] res=new int[nums.length];
        res[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            res[i]=res[i-1]+nums[i];
        }
        return res;
    }
}
