class Solution {
    public String convert(String s, int numRows) {
        int len = s.length();
        StringBuilder[] sb = new StringBuilder[numRows];
        for(int i = 0; i<numRows; i++){
            sb[i] = new StringBuilder();
        }
        int i = 0;
        while(i<len){
            for(int j = 0; j<numRows && i<len; j++){
                sb[j].append(s.charAt(i));
                i++;
            }
            for(int j = numRows-2; j>=1 && i<len; j--){
                sb[j].append(s.charAt(i));
                i++;
            }
        }
        for(int j = 1; j<numRows; j++){
            sb[0].append(sb[j]);
        }
        return sb[0].toString();
    }
}