class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int d = 0;
        int r = matrix.length-1;
        int c = matrix[0].length-1;
        int rstart = 0;
        int cstart = 0;
        while(cstart<=c && rstart<=r){
            if(d==0){
                for(int i = cstart; i<=c; i++){
                    ans.add(matrix[rstart][i]);
                }
                rstart++;
                d++;
            }
            else if(d==1){
                for(int i = rstart; i<=r; i++){
                    ans.add(matrix[i][c]);
                }
                c--;
                d++;
            }
            else if(d==2){
                for(int i = c; i>=cstart; i--){
                    ans.add(matrix[r][i]);
                }
                r--;
                d++;
            }
            else if(d==3){
                for(int i = r; i>=rstart; i--){
                    ans.add(matrix[i][cstart]);
                }
                cstart++;
                d=0;
            }
        }
        return ans;
    }
}


