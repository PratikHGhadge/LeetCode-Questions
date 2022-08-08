class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int len = s.length()-1;
        while(s.charAt(len)==' '){
            len--;
        }
        for(int i = len; i>=0; i--){
            if(s.charAt(i)==' '){
                break;
            }
            count++;
        }
        return count;
    }
}   