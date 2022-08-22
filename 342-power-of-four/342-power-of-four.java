class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<0){
            return false;
        }
        Long num = Long.valueOf(1);
        while(num<=n){
            if(num==n){
                return true;
            }
            num  = num * 4;
        }
        return false;
    }
}