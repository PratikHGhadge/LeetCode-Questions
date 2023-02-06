class Solution {
    public String smallestSubsequence(String s) {
        Stack<Character> st = new Stack<>();
        int[] freq = new int[26];
        boolean[] exist = new boolean[26];
        for(int i = 0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i = 0; i<s.length(); i++){
            freq[s.charAt(i)-'a']--;
            if(exist[s.charAt(i)-'a']){
                continue;
            }
            while(st.size()>0 && (s.charAt(i)<st.peek()) && freq[st.peek()-'a']>0) {
                char ch = st.pop();
                exist[ch-'a'] = false;
            }
            st.push(s.charAt(i));
            exist[s.charAt(i)-'a'] = true;
        }
        char[] ans = new char[st.size()];
        int i = st.size()-1;
        while(i>=0){
            ans[i--] = st.pop();
        }
        return new String(ans);
    }
}