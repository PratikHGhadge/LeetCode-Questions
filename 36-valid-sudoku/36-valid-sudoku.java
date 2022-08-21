class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean ans = true;
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[0].length; j++){
                if(board[i][j]!='.'){
                    if(map.containsKey(board[i][j])){
                        return false;
                    }else{
                        map.putIfAbsent(board[i][j], 1);
                    }
                }
            }
            map.clear();
        }
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[0].length; j++){
                if(board[j][i]!='.'){
                    if(map.containsKey(board[j][i])){
                        return false;
                    }else{
                        map.putIfAbsent(board[j][i], 1);
                    }
                }
            }
            map.clear();
        }
        
        if(isValidSqure(board, 0, 0) && isValidSqure(board, 0, 3) && isValidSqure(board, 0, 6)&&
          isValidSqure(board, 3, 0) && isValidSqure(board, 3, 3) && isValidSqure(board, 3, 6)&&
          isValidSqure(board, 6, 0) && isValidSqure(board, 6, 3) && isValidSqure(board, 6, 6)){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean isValidSqure(char[][] board, int a, int b){
        Map<Character, Integer> map1 = new HashMap<>();
        for(int i = a; i<a+3; i++){
            for(int j = b; j<b+3; j++){
                if(board[i][j]!='.'){
                    if(map1.containsKey(board[i][j])){
                        return false;
                    }else{
                        map1.putIfAbsent(board[i][j], 1);
                    }
                }
            }
        }
        map1.clear();
        return true;
    }
}