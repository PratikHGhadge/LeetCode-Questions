class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(maxConsecutive(answerKey, k, 'T') , maxConsecutive(answerKey, k, 'F'));
    }
    
    public int maxConsecutive(String s, int k, char ch){
        int ans = 0, l = 0; 
        int zeroCount = 0;
        for(int r = 0; r<s.length(); r++){
            if(s.charAt(r)==ch){
                zeroCount++;
            }
            while(zeroCount>k){
                if(s.charAt(l)==ch){
                    zeroCount--;
                }
                l++;
            }
            ans = Math.max(ans, r-l+1);
        }
        return ans;
    }
}