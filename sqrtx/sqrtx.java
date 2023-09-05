class Solution {
    public int mySqrt(int x) {
        long start = 0;
        long end = x;
        long mid;
        while(start<=end){
            mid = start + (end-start)/2;
            if(mid*mid<x){
                start=mid+1;
            }else if(mid*mid>x){
                end = mid-1;
            }else if(mid*mid==x){
                return (int)mid;
            }
        }
        return (int)end;
    }
}