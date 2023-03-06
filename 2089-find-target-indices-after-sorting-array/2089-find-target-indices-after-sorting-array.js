class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>(); // initializing new ArrayList
        Arrays.sort(nums);        // this method will sort array
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==target){
                ans.add(i);
            }
        }
        return ans;
    }
}