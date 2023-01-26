class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        Map<Integer, Integer> rankMap = new HashMap<>();
        Map<Character, Integer> suitsMap = new HashMap<>();
        for(Integer temp : ranks){
            rankMap.put(temp, rankMap.getOrDefault(temp, 0)+1);
        }
        for(Character temp1 : suits){
            suitsMap.put(temp1, suitsMap.getOrDefault(temp1, 0)+1);
        }
        if(suitsMap.size()==1){
            return "Flush";
        }  
        for(Integer temp : ranks){
            if(rankMap.get(temp)>=3){
                return "Three of a Kind";
            }
        }
        for(Integer temp : ranks){
            if(rankMap.get(temp)>=2){
                return "Pair";
            }
        }
        return "High Card";
    }
}




