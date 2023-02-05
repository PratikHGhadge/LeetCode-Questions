class Solution {
    public long pickGifts(int[] gifts, int k) {
        Arrays.sort(gifts);
        while(k--!=0){
            long max = Integer.MIN_VALUE;
            int idx = 0;
            for(int i = 0; i<gifts.length; i++){
                if(gifts[i]>max){
                    max = gifts[i];
                    idx = i;
                }
            }
            gifts[idx] = (int)Math.sqrt(max);
        }
        long ans = 0;
        for(Integer i : gifts){
            ans+=i;
        }
        return ans;
    }
}