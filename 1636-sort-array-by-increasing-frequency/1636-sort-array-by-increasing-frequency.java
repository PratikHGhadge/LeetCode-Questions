class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            ans.add(nums[i]);
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        Collections.sort(ans, (a, b)->{
            return map.get(a)==map.get(b) ? b-a : map.get(a)-map.get(b);
        });
        return ans.stream().mapToInt(i->i).toArray();
    }
}