class Solution {
    public int distinctAverages(int[] nums) {
        Set<Float> set = new HashSet<>();
        Arrays.sort(nums);
        int i = 0; 
        int j = nums.length-1;
        while(i<j){
            float avg = (float)(nums[i]+nums[j])/2;
            set.add(avg);
            i++;
            j--;
        }
        return set.size();
        
    }
}