class Solution {
    public int sum(int[] arr, int s, int e){
        int ans = 0;
        for(int i = s; i<=e; i++){
            ans+=arr[i];
        }
        return ans;
    }
    public int sumOddLengthSubarrays(int[] arr) {
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j<arr.length; j++){
                if(Math.abs(j-i+1)%2!=0){
                    ans +=sum(arr,i,j);  
                }
            }
        }
        return ans;
    }
}