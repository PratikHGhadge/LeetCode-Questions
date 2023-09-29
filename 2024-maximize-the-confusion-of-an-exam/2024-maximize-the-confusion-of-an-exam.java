class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int ans = 0, l = 0; 
        int zeroCount = 0;
        for(int r = 0; r<answerKey.length(); r++){
            if(answerKey.charAt(r)=='T'){
                zeroCount++;
            }
            while(zeroCount>k){
                if(answerKey.charAt(l)=='T'){
                    zeroCount--;
                }
                l++;
            }
            ans = Math.max(ans, r-l+1);
        }
        zeroCount = 0;
        l=0;
        for(int r = 0; r<answerKey.length(); r++){
            if(answerKey.charAt(r)=='F'){
                zeroCount++;
            }
            while(zeroCount>k){
                if(answerKey.charAt(l)=='F'){
                    zeroCount--;
                }
                l++;
            }
            ans = Math.max(ans, r-l+1);
        }
        return ans;
    }
}