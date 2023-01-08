class Solution {
    public int maxPoints(int[][] p) {
        int n = p.length;
        if(n==1){
            return 1;
        }
        if(n<=2){
            return 2;
        }
        int maxAns = 2;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                int total = 2;
                for(int k = 0; k<n; k++){
                    if(k!=i && k!=j){
                        if(((p[j][1]-p[i][1])*(p[k][0]-p[i][0]))==((p[k][1]-p[i][1])*(p[j][0]-p[i][0]))){
                        total++;
                        }
                    }
                }
                maxAns = Math.max(total, maxAns);
                total = 0;
            }
        }
        return maxAns;
    }
}