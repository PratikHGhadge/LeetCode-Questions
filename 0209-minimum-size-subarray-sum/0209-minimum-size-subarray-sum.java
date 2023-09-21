class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }
        int j=0, i = 0, sum = 0, ans = Integer.MAX_VALUE;
        while(j<nums.length){
            sum+=nums[j++];
            while(sum>=target){
                ans = Math.min(ans, j-i);
                sum-=nums[i++];
            }
        }
        if(ans==Integer.MAX_VALUE){
            return 0;
        }
        return ans;
        
    }
}