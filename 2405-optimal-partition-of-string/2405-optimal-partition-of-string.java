class Solution {
    public int partitionString(String s) {
        Set<Character> set = new HashSet<>();
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            }else{
                count++;
                set.clear();
                set.add(s.charAt(i));
            }
        }
        return count+1;
    }
    
}