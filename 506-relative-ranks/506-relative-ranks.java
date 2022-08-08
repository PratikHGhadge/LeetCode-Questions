class Solution {
    public String[] findRelativeRanks(int[] score) {
        int len = score.length;
        int[] arr = new int[len];
        for(int i=0; i<len; i++){
            arr[i] = score[i];
        }
        Arrays.sort(arr);
        Map<Integer, String> map = new HashMap<>();
        map.put(arr[len-1], "Gold Medal");
        if(len>=2){
            map.put(arr[len-2], "Silver Medal");    
        }
        if(len>=3){
            map.put(arr[len-3], "Bronze Medal");    
        }
        int temp = 4;
        for(int i = len-4; i>=0; i--){
            map.put(arr[i], ""+temp);
            temp++;
        }
        String[] ans = new String[score.length];
        for(int i = 0; i<len; i++){
            ans[i] = map.get(score[i]);
        }
        return ans;
    }
}