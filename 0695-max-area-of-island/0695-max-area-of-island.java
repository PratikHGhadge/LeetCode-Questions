class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(grid[i][j]==1){
                    Integer[] count = {0};
                    dfs(grid, i, j, count);
                    ans = Math.max(ans, count[0]);
                }
            }
        }
        return ans;
    }
    
    public static void dfs(int[][] grid, int row, int col, Integer[] count){
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || grid[row][col]==0 ){
            return ;
        }
        count[0]++;
        grid[row][col] = 0;
        // up
        dfs(grid, row-1, col, count);
        // down
        dfs(grid, row+1, col, count);
        // left
        dfs(grid, row, col-1, count);
        // right
        dfs(grid, row, col+1, count);
    }
}