class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] indegree  = new int[n+1];
        int[] outdegree = new int[n+1];
        for(int i = 0; i<trust.length; i++){
            indegree[trust[i][0]]++;
            outdegree[trust[i][1]]++;
        }
        for(int i = 1; i<=n; i++){
            if(indegree[i]==0 && outdegree[i]==n-1){
                return i;
            }
        }
        return -1;
    }
}