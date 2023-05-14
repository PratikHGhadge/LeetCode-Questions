class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (r1, r2) ->{
            return Integer.compare(r1[0], r2[0]);
        });
        ArrayList<int[]> ans = new ArrayList<>();
        for(int i = 0; i<intervals.length; i++){
            if(ans.isEmpty() || intervals[i][0] > ans.get(ans.size()-1)[1]){
                ans.add(intervals[i]);
            }else{
                ans.get(ans.size()-1)[1] = Math.max(ans.get(ans.size()-1)[1], intervals[i][1]);
            }
        }
        int[][] newAns = new int[ans.size()][2];
        for(int i = 0; i<ans.size(); i++){
            newAns[i][0] = ans.get(i)[0];
            newAns[i][1] = ans.get(i)[1];
        }
        return newAns;
    }
}