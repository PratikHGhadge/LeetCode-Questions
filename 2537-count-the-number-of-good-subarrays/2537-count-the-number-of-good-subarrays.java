class Solution {
    public long countGood(int[] nums, int k) {
         HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        int s = 0;
        int e = 0;
        long goodSubarr = 0;
        int pairs = 0;
        while(s<e || e<len){
            while(pairs<k && e<len){
                int num = nums[e];
                
                int freq = map.getOrDefault(num, 0);
                pairs += freq;
                map.put(num, freq+1);
                e++;
            }
            if(pairs>=k){
                int validsubArrays = len - e +1;
                goodSubarr += validsubArrays;
            }
            
            int num = nums[s];
            int f =  map.get(num);
            pairs -= f-1;
            map.put(num, f-1);
            
            s++;
        }
        return goodSubarr;   
    }
}