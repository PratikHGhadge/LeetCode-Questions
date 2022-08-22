class Solution {
public:
    bool isPowerOfFour(int n) {
        if(n<0){
            return false;
        }
        long num = 1;
        while(num<=n){
            if(num==n){
                return true;
            }
            num  = num * 4;
        }
        return false;
    }
};