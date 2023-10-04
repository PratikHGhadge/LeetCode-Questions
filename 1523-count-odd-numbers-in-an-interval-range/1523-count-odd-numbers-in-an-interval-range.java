class Solution {
    public int countOdds(int low, int high) {
     // 11 12 13 14 15 16 17 18 19 20 21  
        if(low%2!=0 && high%2!=0){
            return (high-low)/2+1;
        }
     // 10 11 12 13 14 15 16 17 18 19 20
        if(low%2==0 && high%2==0){
            return (high-low)/2;
        }
     // 10 11 12 13 14 15 16 17 18 19 20 21
        return ((high-low)/2)+1;
    }
}