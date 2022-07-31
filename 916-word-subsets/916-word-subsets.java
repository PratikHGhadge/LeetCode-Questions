class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> list = new ArrayList();
        int[] words2Map = new int[26];
        
        for(String str:words2){
            int[]  char0 = new int[26];
            
            for(char ch: str.toCharArray()){
                char0[ch-'a']++;
            }
            
            for(int i = 0; i<26; i++){
                words2Map[i] = Math.max(words2Map[i], char0[i]);
            }
        }
        
        for(String str:words1){
            if(isValid(words2Map, str)){
                list.add(str);
            }
        }
        return list;
        
    }
    
    public boolean isValid(int[] words2Map, String str){
        int[]  char1 = new int[26];  
        for(char ch: str.toCharArray()){
            char1[ch-'a']++;
        }
        for(int i = 0; i<26; i++){
                if(char1[i]<words2Map[i]){
                    return false;
                }
            }
        return true;
    }
}