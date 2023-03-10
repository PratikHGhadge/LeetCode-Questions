class Solution {
    Map<Integer, ArrayList<Integer>> map = new HashMap<>();
    public Solution(int[] nums) {
        for(int i = 0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], new ArrayList<Integer>());
            }
            map.get(nums[i]).add(i);
        }
    }
    public int pick(int target) {
        ArrayList<Integer> list = map.get(target);
        double d = Math.random()*list.size();
        return list.get((int)d);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */