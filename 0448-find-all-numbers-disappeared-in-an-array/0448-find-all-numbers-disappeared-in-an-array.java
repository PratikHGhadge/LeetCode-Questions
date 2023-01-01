class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 1; i<=n; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}
    