class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        for(int i=0,j=n,index=0; index<nums.length; i++, j++){
            arr[index++] = nums[i];
            arr[index++] = nums[j];
        }
        return arr;
    }
}