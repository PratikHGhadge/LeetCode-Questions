class Solution {
    public int differenceOfSum(int[] nums) {
        int sumE = 0;
        int sumD = 0;
        for(int i = 0; i<nums.length; i++){
            sumE += nums[i];
            sumD += digitSum(nums[i]);
        }
        return Math.abs(sumE-sumD);
    }
    
    public int digitSum(int n){
        int ans = 0;
        while(n!=0){
            ans+=n%10;
            n = n /10;
        }
        return ans;
    }
}