class Solution {
    int ans = 1;
    int dist[] = new int[100005];
    public int longestPath(int[] parent, String s) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0; i<s.length(); i++) list.add(new ArrayList<>());
        for(int i=1; i<s.length(); i++){
            list.get(parent[i]).add(i);
        }
        dfs(0, s, list);   
        return ans;        
    }
    public void dfs(int src, String s, ArrayList<ArrayList<Integer>> list){
        dist[src] = 1; 
        for(int child : list.get(src)){
            dfs(child, s, list);
            if(s.charAt(child) != s.charAt(src)){
                ans = Math.max(ans, dist[src] + dist[child]);
                dist[src] = Math.max(dist[src], dist[child] +1);             
            }                        
        }
    }
}