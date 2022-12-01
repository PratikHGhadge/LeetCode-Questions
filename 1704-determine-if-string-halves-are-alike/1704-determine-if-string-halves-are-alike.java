class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        String a = s.substring(0, n/2);
        String b = s.substring(n/2);
        int count_a = 0;
        int count_b = 0;
        for(int i = 0; i<n/2; i++){
            char ch_a = a.charAt(i);
            char ch_b = b.charAt(i);
            if(ch_a == 'a' || ch_a == 'A' || 
               ch_a == 'e' || ch_a == 'E' ||
               ch_a == 'i' || ch_a == 'I' ||
               ch_a == 'o' || ch_a == 'O' ||
               ch_a == 'u' || ch_a == 'U'){
                count_a++;
            }
            if(ch_b == 'a' || ch_b == 'A' || 
               ch_b == 'e' || ch_b == 'E' ||
               ch_b == 'i' || ch_b == 'I' ||
               ch_b == 'o' || ch_b == 'O' ||
               ch_b == 'u' || ch_b == 'U'){
                count_b++;
            }
        }
        return count_a == count_b;
    }
}