class Solution {
    public void rotate(int[][] matrix) {
        for(int i = 0; i<matrix.length; i++){
            for(int j = i; j < matrix[i].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0; i<matrix.length; i++){
            reverse(matrix, i);
        }
    }
    
    public void reverse(int[][] matrix, int i){
        int a = 0; 
        int b = matrix[i].length-1; 
        while(a<=b){
            int temp = matrix[i][a];
            matrix[i][a] = matrix[i][b];
            matrix[i][b] = temp;
            a++;
            b--;
        }  
    }
}