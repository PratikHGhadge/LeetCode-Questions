class Solution {
    int[] ans;
    public int[] countSubTrees(int n, int[][] edges, String labels) {
        List<List<Integer>> adj = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[] edge: edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        
        ans = new int[n];
        
        count(n, adj, labels, 0, new boolean[n]);
        
        return ans;
    }
    
    private int[] count(int n, List<List<Integer>> adj, String labels, int vertex, boolean[] vis){
        vis[vertex] = true;
        
        int[] letters = new int[26];
        for(int neigh: adj.get(vertex)){
            if(!vis[neigh]){
                int[] prev = count(n, adj, labels, neigh, vis);
                
                for(int i = 0; i < 26; i++){
                    letters[i] += prev[i];
                }
            }
        }
        
        letters[labels.charAt(vertex) - 'a']++;
        ans[vertex] = letters[labels.charAt(vertex) - 'a'];
        
        return letters;
    }
}