class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(k>n) k = k%n;
        revereseSeprate(nums, 0, n-1);
        revereseSeprate(nums, 0, k-1);
        revereseSeprate(nums, k, n-1);
        
    }
    public void revereseSeprate(int[] nums, int s, int e){
        while(s<e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
}