class Solution {
    public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder("");
        int al = a.length()-1;
        int bl = b.length()-1;
        int carry = 0;
        while(al>=0 || bl>=0){
            int sum = carry;
            if(al>=0){
                sum = sum + a.charAt(al--)-'0';
            }
            if(bl>=0){
                sum = sum + b.charAt(bl--)-'0';
            }
            if(sum>1){
                carry = 1;
            }else{
                carry = 0;
            }
            ans.append(sum%2);
        }
        if(carry!=0){
            ans.append(carry);
        }
        return ans.reverse().toString();
    }
}