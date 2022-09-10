class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack();
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='*'){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder ans = new StringBuilder();
        int size = st.size();
        for(int i = 0; i<size; i++){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}