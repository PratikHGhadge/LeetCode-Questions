class Solution {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0; i<n; i++){
            list.add(new ArrayList());
        }
        for(int i = 0; i<edges.length; i++){
            int v = edges[i][0];
            int u = edges[i][1];
            list.get(v).add(u);
            list.get(u).add(v);
        }
        boolean[] visited = new boolean[n];
        return dfs(list, visited, hasApple, 0);
    }
    
    public int dfs(ArrayList<ArrayList<Integer>> list, boolean[] visited, List<Boolean> hasApple, int source){
        visited[source] = true;
        int time = 0;
        for(int vertex : list.get(source)){
            if(visited[vertex]==false){
                time+=dfs(list, visited, hasApple, vertex);
            }
        }
        if(source!=0 && (hasApple.get(source) || time>0)){
            time+=2;
        }
        return time;
    }
}