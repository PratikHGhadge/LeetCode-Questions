class Solution {
    public int minDeletionSize(String[] strs) {
        int row = strs.length;
        int col = strs[0].length();
        char[][] ch = new char[row][col];
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                ch[i][j]=strs[i].charAt(j);
            }
        }
        int del = 0;
        for(int i = 0; i<col; i++){
            boolean flag = true;
            for(int j = 0; j<row-1; j++){
                if(ch[j][i]>ch[j+1][i]){
                    flag = false;
                }
            }
            if(flag==false){
                del++;
            }
        }
        return del;
    }
}