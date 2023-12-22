class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList<>();
        for(int i=0; i<l.length; i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j = l[i]; j<=r[i]; j++){
                list.add(nums[j]);
            }
            Collections.sort(list);
            ans.add(checkIfArithmetic(list));
        }
        return ans;
    }
    
    public Boolean checkIfArithmetic(ArrayList<Integer> list){
        int diff = list.get(1)-list.get(0);
        for(int i = 1; i<list.size()-1; i++){
            if((list.get(i+1)-list.get(i))!=diff){
                return false;
            }
        }
        return true;
    }
}