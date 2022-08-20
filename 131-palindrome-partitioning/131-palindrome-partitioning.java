class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> path = new ArrayList<>();
        helper(0, s, ans, path);
        return ans;
    }
    
    public void helper(int index, String s, List<List<String>> ans, List<String> path){
        if(index == s.length()){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int i = index; i<s.length(); i++){
            if(isPalindrome(s, index, i)){
                path.add(s.substring(index, i+1));
                helper(i+1, s, ans, path); 
                path.remove(path.size()-1);
            }
        }
    }
    
    boolean isPalindrome(String s, int start, int e){
        while(start<e){
            if(s.charAt(start++)!=s.charAt(e--)){
                return false;
            }
        }
        return true;
    }
}