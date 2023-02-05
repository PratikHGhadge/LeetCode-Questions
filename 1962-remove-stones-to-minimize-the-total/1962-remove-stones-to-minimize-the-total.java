class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(Integer i : piles){
            q.add(i);
        }
        while(k-->0){
            int x = q.poll();
            int max;
            if(x%2==0){
                max = x/2;
            }else{
                max = (x/2)+1;
            }
            q.add(max);
        }
        int ans = 0;
        while(q.size()>0){
            ans+=q.poll();
        }
        return ans;
    }
}