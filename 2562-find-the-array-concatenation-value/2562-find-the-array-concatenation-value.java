class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int i = 0; 
        int j = nums.length-1;
        long ans = 0;
        while(i<j){
                String concat = nums[i]+""+nums[j];
                long temp = Integer.parseInt(concat);
                ans+=temp;
            i++;
            j--;
        }
        if(nums.length%2!=0){
            int mid = (nums.length-1)>>1;
            ans += nums[mid];
            return ans;
        }
        return ans;
    }
}