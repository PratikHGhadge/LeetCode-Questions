class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int ans = 0, j=0, maxCount=0;
        for(int i = 0; i<s.length(); i++){
            count[s.charAt(i)-'A']++;
            maxCount = Math.max(maxCount, count[s.charAt(i)-'A']);
            while(i-j+1-maxCount>k){
                count[s.charAt(j)-'A']--;
                j++;
            }
            ans = Math.max(i-j+1, ans);
        }
        return ans;
    }
}
