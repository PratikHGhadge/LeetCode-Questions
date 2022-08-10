class Solution {
    public int countPrimes(int n) {
        if(n<=2){
            return 0;
        }
        boolean[] arr = new boolean[n];
        int limit = (int)Math.sqrt(n);
        for(int i = 2; i<=limit; i++){
            if(arr[i]==false){
                for(int j = i*i; j<n; j+=i){
                    arr[j]=true;
                }
            }
        }
        int count = 0;
        for(int i = 2; i<arr.length; i++){
            if(arr[i]==false) count++;
        }
        return count;
    }
}