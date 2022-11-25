class Solution {
    public static boolean exist(char[][] board, String word) {
        int r = board.length;
        int c = board[0].length;
        Boolean[][] visited = new Boolean[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                visited[i][j] = false;            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (board[i][j] == word.charAt(0) && search(board, i, j, word, 0, visited)){
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean search(char[][] board, int i, int j, String word, int idx, Boolean[][] visited) {
        if (idx == word.length()-1){
            return true;
        }
        visited[i][j] = true;
        if (i>0 && !visited[i-1][j] && board[i-1][j]==word.charAt(idx+1) && search(board, i-1, j, word, idx+1, visited )){
            return true;
        }
        if (j>0 && !visited[i][j-1] && board[i][j-1]==word.charAt(idx+1) && search(board, i, j-1, word, idx+1, visited )){
            return true;
        }
        if (i<board.length-1 && !visited[i+1][j] && board[i+1][j]==word.charAt(idx+1) && search(board, i+1, j, word, idx+1, visited )){
            return true;
        }
        if (j<board[0].length-1 && !visited[i][j+1] && board[i][j+1]==word.charAt(idx+1) && search(board, i, j+1, word, idx+1, visited )){
            return true;
        }
        visited[i][j] = false;
        return false;
    }
}