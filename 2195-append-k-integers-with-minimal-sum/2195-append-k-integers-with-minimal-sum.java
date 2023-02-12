class Solution {
    public long minimalKSum(int[] nums, int k) {
        long KNumSum = (long)k*(k+1)/2;
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for(int i : nums){
            if(!set.contains(i) && i<=k && i>=1){
                count++;
                KNumSum -= (long)i;
            }
            set.add(i);
        }
        int i = k+1;
        while(count>0){
            if(!set.contains(i)){
                KNumSum+=i;
                count--;
            }
            i++;
        }
        return KNumSum;
    }
}