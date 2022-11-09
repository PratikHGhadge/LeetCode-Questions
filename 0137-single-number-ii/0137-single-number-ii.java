class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        for(int n:nums){
            if(map.get(n)!=3){
                return n;
            }
        }
        return -1;
    }
}