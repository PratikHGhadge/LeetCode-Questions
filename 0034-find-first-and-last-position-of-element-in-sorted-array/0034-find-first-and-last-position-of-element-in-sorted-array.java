class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans =  {-1, -1};
        int first = search(nums, target, true);
        int second = search(nums, target, false);
        ans[0] = first;
        ans[1] = second;
        return ans;
    }
    
    public static int search(int[] nums, int target, boolean value){
        int s = 0;
        int e = nums.length-1;
        int ans = -1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(nums[m]<target){
                s = m+1;
            }else if(nums[m]>target){
                e = m-1;
            }else{
                ans = m;
                if(value==true){
                    e = m-1;
                }else{
                    s = m+1;
                }
            }
        }
        return ans;
    }
}