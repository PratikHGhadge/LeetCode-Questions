class Solution {
    public int longestSubarray(int[] nums) {
        int l=0, r=0, ans=0;
        int count_0 = 0;
        for(r = 0; r<nums.length; r++){
            if(nums[r]==0) count_0++;
            while(count_0>1){        
                if(nums[l]==0){
                    count_0--;   
                }
                l++;
            }
            ans = Math.max(ans, r-l);
        }
        return ans;
    }
}