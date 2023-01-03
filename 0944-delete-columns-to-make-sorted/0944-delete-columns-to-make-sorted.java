class Solution {
    public int minDeletionSize(String[] strs) {
        int r = strs.length;
        int c = strs[0].length();
        char[][] ch = new char[r][c];
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                ch[i][j]=strs[i].charAt(j);
            }
        }
        int ans = 0;
        for(int i = 0; i<c; i++){
            boolean flag = true;
            for(int j = 0; j<r-1; j++){
                if(ch[j][i]>ch[j+1][i]){
                    flag = false;
                }
            }
            if(flag==false){
                ans++;
            }
        }
        return ans;
    }
}