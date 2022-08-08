class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> s1 = new ArrayList<>();
        List<Integer> s2 = new ArrayList<>();
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
                s2.remove(Integer.valueOf(i));
            }
        }
        int[] ans1 = new int[ans.size()];
        for(int i = 0; i<ans.size(); i++){
            ans1[i] = ans.get(i);
        }
        return ans1;
    }
}