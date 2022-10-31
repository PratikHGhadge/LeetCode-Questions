class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i = 0; i<matrix.length; i++){
            int r = i, c = 0;
            int temp = matrix[r][c];
            while(r<=matrix.length-1 && c<=matrix[0].length-1){
                if(matrix[r][c]!=temp){
                    return false;
                }else{
                    r++;
                    c++;
                }
            }
        }
        
        for(int i = 0; i<matrix[0].length; i++){
            int r = 0, c = i;
            int temp = matrix[r][c];
            while(r<=matrix.length-1 && c<=matrix[0].length-1){
                if(matrix[r][c]!=temp){
                    return false;
                }else{
                    r++;
                    c++;
                }
            }
        }
        return true;
    }
}