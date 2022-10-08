class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minDiffTillNow = Integer.MAX_VALUE;
        int ans = -1;
        for(int i = 0; i<nums.length-2; i++){
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int temp = nums[i]+nums[j]+nums[k];
                int diff = Math.abs(target-temp);
                if(diff<minDiffTillNow){
                    ans = temp;
                    minDiffTillNow = diff;
                }
                if(temp>target) {
                    k--;
                }else if(temp<target){
                    j++;
                }else{
                    return ans;
                    }
                }
            }
            return ans;
    }
}