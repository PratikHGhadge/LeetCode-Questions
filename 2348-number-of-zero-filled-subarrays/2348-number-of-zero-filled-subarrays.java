class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long len = nums.length;
        long count = 0;
        for(int i = 0; i<len; i++){
            long zeros = 0;
            while(i<len && nums[i]==0){
                zeros++;
                i++;
            }
            count += ((zeros*(zeros+1))/2);
        }
        return count;
    }
}