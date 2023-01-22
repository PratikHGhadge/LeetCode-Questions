class Solution {
    public boolean isValid(String s) {
        Stack<Character> ans = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            if(ans.empty()){
                ans.push(s.charAt(i));
            }else if(ans.peek()=='(' && s.charAt(i)==')'){
                ans.pop();
            }else if(ans.peek()=='[' && s.charAt(i)==']'){
                ans.pop();
            }else if(ans.peek()=='{' && s.charAt(i)=='}'){
                ans.pop();
            }else{
                ans.push(s.charAt(i));
            }
        }
        return ans.empty();
    }
}