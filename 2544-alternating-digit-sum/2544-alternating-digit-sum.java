class Solution {
    public int alternateDigitSum(int n) {
        int res = 0;
        int len = (""+n).length();
        boolean add;
        if(len%2==0){
            add = false;
        }else{
            add = true;
        }
        while (n > 0) {
            int digit = n % 10;
            if (add) {
                res += digit;
            } else {
                res -= digit;
            }
            add = !add;
            n /= 10;
        }
        return res;
    }
}