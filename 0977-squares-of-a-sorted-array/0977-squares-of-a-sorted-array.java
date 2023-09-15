class Solution {
    public int[] sortedSquares(int[] nums) {
        int j = 0;
        int k = nums.length-1;
        int ans[] = new int[nums.length];
        for(int i = nums.length-1; i>=0; i--){
            int win1 = nums[j]*nums[j];
            int win2 = nums[k]*nums[k];
            if(win1>win2){
                ans[i] = win1;
                j++;
            }else{
                ans[i] = win2;
                k--;
            }
        }
        return ans;
    }
}