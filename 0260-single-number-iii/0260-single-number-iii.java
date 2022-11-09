class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        int i = 0;
        for(int n:nums){
            if(map.get(n)==1){
                ans[i]=n;
                i++;
            }
            if(i==2){
                return ans;
            }
        }
        return ans;
    }
}