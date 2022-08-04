class Solution {
    public String reverseVowels(String s) {
        StringBuilder temp = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            if(isVowel(s.charAt(i))){
                temp.append(s.charAt(i));
            }
        }
        temp.reverse();
        StringBuilder ans1 = new StringBuilder();
        int j = 0;
        for(int i = 0; i<s.length(); i++){
            if(isVowel(s.charAt(i))){
                ans1.append(temp.charAt(j));
                j++;
            }else{
                ans1.append(s.charAt(i));
            }
        }
        return ans1.toString();
    }
    
    public boolean isVowel(char ch){
        if(ch=='i' || ch=='o'|| ch=='e'|| ch=='a'|| ch=='u'|| ch=='I' || ch=='O'|| ch=='E'|| ch=='A'|| ch=='U'){
            return true;
        }
        return false;
    }
}