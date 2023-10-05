class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        int i = 0, j = 0;
        int count = 0;
        while(i!=n && j!=n){
            if(nums[i]==nums[j]){
                count++;
                j++;
            }else{
                if(count>n/3){
                    ans.add(nums[i]);
                }
                i=j;
                count = 0;
            }
        }
         if(count>n/3){
            ans.add(nums[i]);
        }
        return ans;
    }
}