class Solution {
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        int src = 0;
        int dest = graph.length-1;
        current.add(src);
        dfs(src, dest, graph, current, ans);
        return ans;
    }
    
    public static void dfs(int src, int dest, int[][] graph, List<Integer> current, List<List<Integer>> ans){
        if(src == dest){
            ans.add(new ArrayList(current));
            return;
        }
        for(int vertex : graph[src]){
            current.add(vertex);
            dfs(vertex, dest, graph, current, ans);
            current.remove(current.size()-1);
        }
    }
}