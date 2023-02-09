class Solution {
    public int minOperations(int n) {
       int ans = 0;
       if(n%2==1){
           int mid = 1;
           for(int i = 0; i<n/2; i++){
               mid = mid+2;
           }
           int arr = 1;
           for(int i = 0; i<n/2; i++){
               ans += mid - arr;
               arr += 2;
           }
       }else{
           int mid = 1;
           for(int i = 0; i<n/2; i++){
               mid = mid+2;
           }
           mid = mid - 1;
           int arr = 1;
           for(int i = 0; i<n/2; i++){
               ans += mid - arr;
               arr += 2;
           }
       }
        return ans;
    }
}