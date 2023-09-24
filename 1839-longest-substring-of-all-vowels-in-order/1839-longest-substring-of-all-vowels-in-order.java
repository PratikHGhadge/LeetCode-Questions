class Solution {
    public int longestBeautifulSubstring(String word) {
        Stack<Character> st = new Stack<>();
        HashSet<Character> set = new HashSet<>();
        int ans = 0;
        for(int i = 0; i<word.length(); i++){
            if(!st.isEmpty() && st.peek()>word.charAt(i)){
                 st.clear();
                 set.clear();
            }
            st.push(word.charAt(i));
            set.add(word.charAt(i));
            if(set.size()>=5){
                ans = Math.max(ans, st.size());
            }
        }
        return ans;
    }
}