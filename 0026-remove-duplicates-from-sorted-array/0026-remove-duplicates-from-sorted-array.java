class Solution {
    public int removeDuplicates(int[] nums) {
      if (nums == null) {
            return 0;
        }
        int right_pointer = 1;
        for(int i = 1; i<nums.length; i++){
            if(nums[i-1]!=nums[i]){
                nums[right_pointer]=nums[i];
                right_pointer++;
            }
        }
        return right_pointer;
    }
}