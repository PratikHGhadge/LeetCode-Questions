class Solution {
    public int minDeletions(String s) {
        int[] freq = new int[26];
        for(int i = 0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }
        Set<Integer> set = new HashSet<>();
        int del = 0;
        for(int val : freq){
            while(val!=0 && set.contains(val)){
                del++;
                val--;
            }
            set.add(val);
        }
        return del;
    }
}