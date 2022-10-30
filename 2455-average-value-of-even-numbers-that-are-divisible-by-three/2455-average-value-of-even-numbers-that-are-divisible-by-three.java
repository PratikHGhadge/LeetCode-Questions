class Solution {
    public int averageValue(int[] nums) {
        int sum = 0;
        int n = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]%6==0){
                sum += nums[i];
                n++;
            }
        }
        if(n==0){
            return 0;
        }else{
            return sum/n;   
        }
    }
}