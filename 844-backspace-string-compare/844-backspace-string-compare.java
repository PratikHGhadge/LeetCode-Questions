class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder st1 = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)!='#'){
                st1.append(s.charAt(i));
            }else{
                if(st1.length()>0){
                    st1.deleteCharAt(st1.length() - 1);   
                }
            }
        }
        StringBuilder st2 = new StringBuilder();
        for(int i = 0; i<t.length(); i++){
            if(t.charAt(i)!='#'){
                    st2.append(t.charAt(i));   
            }else{
                if(st2.length()>0){
                    st2.deleteCharAt(st2.length() - 1);   
                }
            }
        }
        return st1.toString().equals(st2.toString());
    }
}