class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        for(int i = 0; i<nums.length; i++){
            if(map.get(nums[i])==1 && !map.containsKey(nums[i]+1) && !map.containsKey(nums[i]-1)){
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}