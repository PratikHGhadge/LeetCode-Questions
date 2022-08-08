class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for(int i : nums1){
            s1.add(i);
        }
        for(int i : nums2){
            s2.add(i);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i: s1){
            if(s2.contains(i)){
                ans.add(i);
            }
        }
        int[] ans1 = new int[ans.size()];
        for(int i = 0; i<ans.size(); i++){
            ans1[i] = ans.get(i);
        }
        return ans1;
    }
}