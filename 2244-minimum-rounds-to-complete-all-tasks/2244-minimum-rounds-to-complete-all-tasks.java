class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i:tasks){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        int round = 0;
        for(Integer i: map.keySet()){
            int val = map.get(i);
            if(val==1){
                return -1;
            }
            if(val%3==0){
                round+=(val/3);
            }else if(val%3==1 || val%3==2){
                round+=(val/3)+1;
            }
        }
        return round;
    }
}