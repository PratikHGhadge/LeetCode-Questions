class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] item1, int[][] item2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i<item1.length; i++){
            map.put(item1[i][0], item1[i][1]);
        }
        for(int i = 0; i<item2.length; i++){
            map.put(item2[i][0], map.getOrDefault(item2[i][0], 0)+item2[i][1]);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(Integer key : map.keySet()){
            List<Integer> temp = new ArrayList<>();
            temp.add(key);
            temp.add(map.get(key));
            ans.add(temp);
        }
        return ans;
    }
}