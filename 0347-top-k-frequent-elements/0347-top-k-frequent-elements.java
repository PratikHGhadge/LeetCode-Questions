class Solution {
    public static class Pair{
        int key;
        int val;
        Pair(int key, int val){
            this.key = key;
            this.val = val;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        Queue<Pair> que = new PriorityQueue<Pair>((a, b)->b.val-a.val);
        for(Integer i: map.keySet()){
            que.offer(new Pair(i, map.get(i)));
        }
        int[] ans = new int[k];
        for(int i = 0; i<k; i++){
            ans[i] = que.poll().key;
        }
        return ans;
    }
}