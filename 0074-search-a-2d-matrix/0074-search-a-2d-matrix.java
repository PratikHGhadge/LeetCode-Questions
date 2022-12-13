class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int s = 0; 
        int e = matrix.length-1;
        int mid = 0;
        while(s<=e){
            mid = (s+e)/2;
            if(target>=matrix[mid][0] && target<=matrix[mid][matrix[0].length-1]){
                break;
            }
            if(matrix[mid][0]>target){
                e = mid-1;
            }else if(matrix[mid][0]<target){
                s = mid+1;
            }else{
                return true;
            }
        }
        for(int i = 0; i<matrix[0].length; i++){
            if(matrix[mid][i]==target){
                return true;
            }
        }
        return false;
    }
}