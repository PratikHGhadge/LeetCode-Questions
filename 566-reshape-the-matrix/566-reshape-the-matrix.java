class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if((mat.length*mat[0].length) != (r*c)){
            return mat;
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[0].length; j++){
                list.add(mat[i][j]);
            }
        }
        int[][] ans = new int[r][c];
        int temp = 0;
        for(int i=0; i<r; i++){
            for(int j = 0; j<c; j++){
               ans[i][j]  = list.get(temp);
               temp++;
            }
        }
        return ans;
    }
}