class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        if(suits[0]==suits[1]&&suits[1]==suits[2]&&suits[2]==suits[3]&&suits[3]==suits[4]){
            return "Flush";
        }
        int[] map = new int[14];
        int maxF = 0;
        for(Integer temp : ranks){
            map[temp]++;
            maxF = Math.max(maxF, map[temp]);
        }
        if(maxF>=3){
            return "Three of a Kind";
        }else if(maxF>=2){
            return "Pair";
        }else {
            return "High Card";
        }
    }
}




