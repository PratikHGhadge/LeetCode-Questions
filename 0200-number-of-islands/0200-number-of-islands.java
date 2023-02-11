class Solution {
    public int numIslands(char[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        boolean[][] visited = new boolean[m][n];
        int count = 0;
        for (int i = 0; i<m; i++){
            for (int j = 0; j < n; j++) {
                if (arr[i][j]=='1' && visited[i][j]==false){
                    drawTreeForComponent(arr, i, j, visited);
                    count++;
                }
            }
        }
        return count;      
    }
    public static void drawTreeForComponent(char[][] arr, int i, int j, boolean[][] visited) {
        if (i<0 || j<0 || i>=arr.length || j>=arr[0].length || visited[i][j]==true || arr[i][j]=='0'){
            return;
        }
        visited[i][j] = true;
        drawTreeForComponent(arr, i, j+1, visited);
        drawTreeForComponent(arr, i+1, j, visited);
        drawTreeForComponent(arr, i, j-1, visited);
        drawTreeForComponent(arr, i-1, j, visited);
    }
}