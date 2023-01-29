class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        int j = 0;
        for(int i = 0; i<strs.length; i++){
            String temp = sort1(strs[i]);
            if(map.containsKey(temp)){
                ans.get(map.get(temp)).add(strs[i]);
            }else{
                ans.add(j, new ArrayList<String>());
                ans.get(j).add(strs[i]);
                map.put(temp, j);
                j++;
            }
        }
        return ans;
    }
    public String sort1(String str){
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}