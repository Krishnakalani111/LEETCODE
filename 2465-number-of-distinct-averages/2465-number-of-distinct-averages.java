class Solution {
    public int distinctAverages(int[] nums) {
        
        HashSet<Integer> averages = new HashSet<Integer>();
        int n=nums.length;
        Arrays.sort(nums);
        
        
        for(int i=0;i<n/2;++i){
        int average=nums[i]+nums[n-i-1];
        averages.add(average);
        }
         return averages.size();
    }
}