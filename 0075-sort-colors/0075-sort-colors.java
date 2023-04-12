class Solution {
    public void sortColors(int[] nums) {
        int countOf0 = 0;
        int countOf1 = 0;
        int countOf2 = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==0){
                countOf0++;
            }else if(nums[i]==1){
                countOf1++;
            }else if(nums[i]==2){
                countOf2++;
            }
        }
        int p = 0;
        for(int i = 0; i<countOf0; i++){
            nums[i] = 0;
            p++;
        }
        for(int i = p; i<countOf0+countOf1; i++){
            nums[i] = 1;
            p++;
        }
        for(int i = p; i<countOf0+countOf1+countOf2; i++){
            nums[i] = 2;
        }
    }
}