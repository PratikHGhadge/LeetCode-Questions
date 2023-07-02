class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        generateSubSet(nums, 0, new ArrayList<Integer>(), ans);       
        return ans;
    }
    
    public void generateSubSet(int[] nums, int index, List<Integer> current, List<List<Integer>> ans){
        if(index==nums.length){
            ans.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[index]);
        generateSubSet(nums, index+1, current, ans);       
        current.remove(current.size()-1);
        generateSubSet(nums, index+1, current, ans);       
    }
}