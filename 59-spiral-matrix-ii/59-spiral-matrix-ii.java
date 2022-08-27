class Solution {
    public int[][] generateMatrix(int n) {
        int r_start = 0, r_end = n-1;
        int c_start = 0, c_end = n-1;
        int[][] arr = new int[n][n];
        int val = 1, d = 0;
        while(r_start<=r_end && c_start<=c_end){
            if(d==0){
                for(int i = c_start; i<=c_end; i++){
                    arr[r_start][i] = val;
                    val++;
                }
                r_start++;
                d++;
            }
            else if(d==1){
                for(int i =r_start; i<=r_end; i++){
                    arr[i][c_end] = val;
                    val++;
                }
                d++;
                c_end--;
            }
            else if(d==2){
                for(int i = c_end; i>=c_start; i--){
                    arr[r_end][i] = val;
                    val++;
                }
                d++;
                r_end--;
            }
            else if(d==3){
                for(int i = r_end; i>=r_start; i--){
                    arr[i][c_start]=val;
                    val++;
                }
                d=0;
                c_start++;
            }
           
        }
        return arr;
    }
}