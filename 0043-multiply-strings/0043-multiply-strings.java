import java.math.*;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger tnum1 = new BigInteger(num1, 10);
        BigInteger tnum2 = new BigInteger(num2, 10);
        BigInteger ans = tnum1.multiply(tnum2);
        String ans1 = ans.toString(10);
        return ans1;
    }
}