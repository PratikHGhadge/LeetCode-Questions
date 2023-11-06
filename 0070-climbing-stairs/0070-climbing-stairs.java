class Solution {
    public int climbStairs(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        return totalways(0, n, map);
    }
    public int totalways(int curr, int n, Map<Integer, Integer> map){
        if(curr==n){
            return 1; 
        }
        if(curr>n){
            return 0;
        }
        if(map.containsKey(curr)){
            return map.get(curr);
        }
        int oneStep = totalways( curr+1,  n,  map);
        int twoStep = totalways( curr+2,  n,  map);
        map.put(curr, oneStep+twoStep);
        return oneStep+twoStep;
    }
}