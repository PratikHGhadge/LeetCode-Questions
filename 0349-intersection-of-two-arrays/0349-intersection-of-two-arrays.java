class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> ans = new HashSet<>();
        Set<Integer> num = new HashSet<>();
        for(int i : nums1){
            num.add(i);
        }
        for(int i : nums2){
            if(num.contains(i)){
                ans.add(i);
            }
        }
        int[] result = new int[ans.size()];
        int j = 0;
        for(int i : ans){
            result[j] = i;
            j++;
        }
        return result;
    }
}