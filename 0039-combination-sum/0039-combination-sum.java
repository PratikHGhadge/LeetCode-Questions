class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        getCombinationsum(candidates, 0, target, new ArrayList<Integer>(), ans);
        return ans;
    }
    
    public void getCombinationsum(int[] candidates, int index, int target, List<Integer> current, List<List<Integer>> ans){
        if(target<0) return;
        if(target==0){
            ans.add(new ArrayList<>(current));
            return;
        }
        if(index==candidates.length) return;
        if(candidates[index]<=target){
            current.add(candidates[index]);
            getCombinationsum(candidates, index, target-candidates[index], current, ans);
            current.remove(current.size()-1);
        }
        getCombinationsum(candidates, index+1, target, current, ans);
    }
}