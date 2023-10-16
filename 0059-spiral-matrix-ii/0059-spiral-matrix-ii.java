class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int r_start = 0, c_start = 0, r_end = n-1, c_end = n-1, count=1;
        int d = 0;
        while(c_start<=c_end && r_start<=r_end){
            if(d==0){
                for(int i = c_start; i<=c_end; i++){
                ans[r_start][i]=count++;
                }
                r_start++;
                d++;
            }
            
            else if(d==1){
                for(int i = r_start; i<=r_end; i++){
                ans[i][c_end]=count++;
                }
                c_end--;
                d++;
            }
            
            else if(d==2){
                for(int i = c_end; i>=c_start; i--){
                ans[r_end][i]=count++;
                }
                r_end--;
                d++;
            }
            
        
            else if(d==3){
                for(int i=r_end; i>=r_start; i--){
                ans[i][c_start]=count++;
                }   
                c_start++;
                d=0;
            }
        }
        return ans;
    }
}