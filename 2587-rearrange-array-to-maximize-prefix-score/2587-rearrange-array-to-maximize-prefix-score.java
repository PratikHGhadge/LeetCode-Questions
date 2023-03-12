class Solution {
    public int maxScore(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int a = 0;
        int b = n-1;
        while(a<b){
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            a++;
            b--;
        }
        Long[] preSum = new Long[nums.length];
        preSum[0] = (long)nums[0];
        int ans = 0;
        if(preSum[0]<0) return 0;
        if(preSum[0]>0) ans++;
        for(int i = 1; i<n; i++){
            preSum[i] = preSum[i-1] + nums[i];
            if(preSum[i]>0) ans++;
        }
        return ans;
    }
}