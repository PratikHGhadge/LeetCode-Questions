class Solution {
    public int hammingDistance(int x, int y) {
        int t = (x^y);
        int c = 0;
        while(t!=0){
            c = c+(t&1);
            t = t>>1;
        }
        return c;
    }
}