class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] arr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for(String str: words){
            String s = new String();
            for(int i = 0; i<str.length(); i++){
                int temp = str.charAt(i)-'a';
                s+=arr[temp];
            }
            set.add(s);
        }
        return set.size();
    }
}