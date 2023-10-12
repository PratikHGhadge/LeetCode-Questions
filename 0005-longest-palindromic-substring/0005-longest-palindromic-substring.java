class Solution {
    public String longestPalindrome(String s) {
        int ans =0;
        int start = 0;
        for(int i = 0; i<s.length(); i++){
            for(int j = i; j<s.length(); j++){
                int maxlen = j-i+1;
                if(isPalindrome(s, i, j)){
                    if(maxlen>ans){
                        ans = maxlen;
                        start = i;
                    }
                }
            }
        }
        return s.substring(start, start+ans);
    }
    
    public boolean isPalindrome(String str, int s, int e){
        while(s<e){
            if(str.charAt(s)!=str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}