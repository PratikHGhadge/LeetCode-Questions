class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> map = new HashMap<>();
        char ch = 'a';
        map.put(' ', ' ');
        for(int i = 0; i<key.length(); i++){
            if(map.containsKey(key.charAt(i))){
                continue;
            }else{
                map.put(key.charAt(i), ch);
                ch++;
            }
        }
        String ans = "";
        for(int i = 0; i<message.length(); i++){
            ans += map.get(message.charAt(i));
        }
        return ans;
    }
}