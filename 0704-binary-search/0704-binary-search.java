class Solution {
    public int search(int[] nums, int target) {
        return helper(nums, target, 0, nums.length-1);
    }
    private int helper(int[] nums, int target, int start, int end){
        
        int mid = start + (end-start)/2;
        if(start>end){
            return -1;
        }
        if(nums[mid]>target){
            return helper(nums, target, start, mid-1);
        }else if(nums[mid]<target){
            return helper(nums, target, mid+1, end);
        }else{
            return mid;
        }
    }
}