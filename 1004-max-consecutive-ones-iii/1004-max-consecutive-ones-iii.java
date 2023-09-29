class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans = 0, l = 0; 
        int zeroCount = 0;
        for(int r = 0; r<nums.length; r++){
            if(nums[r]==0){
                zeroCount++;
            }
            while(zeroCount>k){
                if(nums[l]==0){
                    zeroCount--;
                }
                l++;
            }
            ans = Math.max(ans, r-l+1);
        }
        return ans;
    }
}