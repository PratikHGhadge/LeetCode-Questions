class Solution {
    public int alternateDigitSum(int n) {
        String str = ""+n;
        int ans = 0;
        int j = 1;
        for(int i = 0; i<str.length(); i++){
            int temp = Integer.parseInt(""+str.charAt(i));
            ans += (j)*temp;
            if(j==1){
                j = -1;
            }else{
                j = 1;
            }
        }
        return ans;
    }
}