class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (r1, r2) ->{
            if(r1[0]==r2[0]){
                return Integer.compare(r1[1], r2[1]);
            }
            return Integer.compare(r1[0], r2[0]);
        });
        ArrayList<int[]> ans = new ArrayList<>();
        for(int i = 0; i<intervals.length; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            if(!ans.isEmpty() && end <= ans.get(ans.size()-1)[1]) {
                continue;
            }
            for(int j = i+1; j<intervals.length; j++){
                if(intervals[j][0]<=end){
                    end = Math.max(end, intervals[j][1]);
                }else{
                    break;
                }
            }
            ans.add(new int[]{start, end});
        }
        int[][] newAns = new int[ans.size()][2];
        for(int i = 0; i<ans.size(); i++){
            newAns[i][0] = ans.get(i)[0];
            newAns[i][1] = ans.get(i)[1];
        }
        return newAns;
    }
}