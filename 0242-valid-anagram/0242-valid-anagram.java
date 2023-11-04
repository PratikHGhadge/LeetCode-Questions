class Solution {
    public boolean isAnagram(String s, String t) {
        String s1 = sort1(s);
        String s2 = sort1(t);
        return s1.equals(s2);
    }
    
    public String sort1(String str){
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}