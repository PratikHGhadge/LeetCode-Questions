class Solution {
    public String reformat(String s) {
        List<Character> letter = new ArrayList<>();
        List<Character> digit = new ArrayList<>();
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) >= 'a' && s.charAt(i)<='z'){
                letter.add(s.charAt(i));
            }else{
                digit.add(s.charAt(i));
            }
        }
        int ls = letter.size();
        int ds = digit.size();
        int size = letter.size() - digit.size();
        if(size<0){
            size = -1*size;
        }
        String ans = new String();
        int a = 0;
        int j = 0;
        if(size != 0 && size != 1){
            return new String("");
        }
        if(size == 0 || size == 1 && ls>ds){
            for(int i = 0; i < ls; i++){
                ans+=(letter.get(a));
                a++;
                if(j<ds){
                    ans+=(digit.get(j));
                    j++;    
                }
            }
        }else {
            j=0;
            a=0;
            for(int i = 0; i < ds; i++){
                ans+=digit.get(a);
                a++;
                if(j<ls){
                    ans+=(letter.get(j));
                    j++;    
                }
            }
        }
        return ans;
        
    }
}