class Solution {
    public int[] numberOfPairs(int[] nums) {
        int p=0;
        Set<Integer> set = new HashSet<>();
        for(int i: nums){
            if(set.contains(i)){
                set.remove(i);
                p++;
            }else{
                set.add(i);
            }
        }
        int[] ans = new int[2];
        ans[0] = p;
        ans[1] = set.size();
        return ans;
    }
}