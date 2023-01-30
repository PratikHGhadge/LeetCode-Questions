class Solution {
    public int tribonacci(int n) {
        int t0 = 0;
        int t1 = 1; 
        int t2 = 1;
        int temp=0;
        if(n==1 || n==2){
            temp = 1;
        }
        for(int i = 3; i<=n; i++){
            temp = t0+t1+t2;
            t0 = t1;
            t1 = t2;
            t2 = temp;
        }
        return temp;
    }
}