class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i++){
            int target = -nums[i];
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                if(nums[j]+nums[k]==target){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    set.add(temp);
                    j++;
                    k--;
                }else if(nums[j]+nums[k]>target){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return new ArrayList<>(set);
    }
}