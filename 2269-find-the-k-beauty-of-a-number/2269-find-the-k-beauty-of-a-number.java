class Solution {
    public int divisorSubstrings(int num, int k) {
        String str = String.valueOf(num);
        int count = 0;
        for(int i =  0; i<str.length()-k+1; i++){
            String st = str.substring(i, i+k);
            int n = Integer.valueOf(st);
            if(n==0){
                continue;
            }
            if(num%n==0){
                count++;
            }
        }
        return count;
    }
}