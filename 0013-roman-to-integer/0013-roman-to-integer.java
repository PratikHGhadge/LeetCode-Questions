class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        int n = s.length();
        for(int i = 0; i<n; i++){
            if(s.charAt(i)=='I'  && i<n-1 && (s.charAt(i+1)=='V' || s.charAt(i+1)=='X')){
                if(s.charAt(i+1)=='V'){
                    ans+=4;
                }else{
                    ans+=9;
                }
                i++;
            }else if(s.charAt(i)=='X'  && i<n-1 && (s.charAt(i+1)=='L' || s.charAt(i+1)=='C')){
                if(s.charAt(i+1)=='L'){
                    ans+=40;
                }else{
                    ans+=90;
                }
                i++;
            }else if(s.charAt(i)=='C' && i<n-1 && (s.charAt(i+1)=='D' || s.charAt(i+1)=='M') ){
                if(s.charAt(i+1)=='D'){
                    ans+=400;
                }else{
                    ans+=900;
                }
                i++;
            }else if(s.charAt(i)=='I'){
                ans+=1;
            }else if(s.charAt(i)=='V'){
                ans+=5;
            }else if(s.charAt(i)=='X'){
                ans+=10;
            }else if(s.charAt(i)=='L'){
                ans+=50;
            }else if(s.charAt(i)=='C'){
                ans+=100;
            }else if(s.charAt(i)=='D'){
                ans+=500;
            }else if(s.charAt(i)=='M'){
                ans+=1000;
            }
        }
        return ans;
    }
}






























