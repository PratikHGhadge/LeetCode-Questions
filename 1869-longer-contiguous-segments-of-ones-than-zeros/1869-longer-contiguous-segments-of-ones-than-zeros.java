class Solution {
    public boolean checkZeroOnes(String s) {
        int max1 = 0;
        int max0 = 0;
        int size = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='0'){
                size = 0;
            }else{
                size++;   
            }
            max1 = Math.max(max1, size);
        }
        size = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='1'){
                size = 0;
            }else{
                size++;
            }
            max0 = Math.max(max0, size);
        }
        if(max1>max0){
            return true;
        }else{
            return false;
        }
    }
}