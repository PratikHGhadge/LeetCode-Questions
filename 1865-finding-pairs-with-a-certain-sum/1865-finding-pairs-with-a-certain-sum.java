class FindSumPairs {
    int[] num1;
    int[] num2;
    Map<Integer, Integer> freq = new HashMap<>();
    public FindSumPairs(int[] nums1, int[] nums2) {
        num1 = nums1;
        num2 = nums2;
        for(int i : nums2){
            freq.put(i, freq.getOrDefault(i, 0)+1);
        }
    }
    
    public void add(int index, int val) {
        freq.put(num2[index], freq.get(num2[index])-1);
        num2[index]+=val;
        freq.put(num2[index], freq.getOrDefault(num2[index], 0)+1);
        
    }
    
    public int count(int tot) {
        int ans = 0;
        for(int i : num1){
            if(freq.containsKey(tot-i)){
                ans+=freq.get(tot-i);
            }
        }
        return ans;
    }
}



/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */