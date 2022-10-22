class Solution {
    public int maxSubArray(int[] nums) {
        int curr_sum=0,highest_sum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            curr_sum=curr_sum + nums[i];
            if(curr_sum>highest_sum){highest_sum=curr_sum;}
            if(curr_sum<0){curr_sum=0;}
        }
       return highest_sum;
    }
}