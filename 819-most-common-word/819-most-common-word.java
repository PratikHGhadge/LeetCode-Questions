class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] word = paragraph.toLowerCase().split("[ !?',;.]+");
        Map<String, Integer> map = new HashMap<>();
        for(String w: word){
            map.put(w, map.getOrDefault(w, 0)+1);
        }
        for(String s: banned){
            if(map.containsKey(s)){
                map.remove(s);
            }
        }
        String temp = null;
        for(String str: map.keySet()){
            if(temp == null || map.get(str)>map.get(temp)){
                temp = str;
            }
        }
        return temp;
    }
}