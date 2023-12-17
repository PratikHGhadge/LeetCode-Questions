class Solution {
    public String longestCommonPrefix(String[] strs) {
        int index =0;
        if(strs[0].length()==0){
            return "";
        }
        for(int i =0; i<strs[0].length(); i++){
            Boolean  flag = true;
            for(int j = 1; j<strs.length; j++){
                if(strs[j].length()>i && strs[j].charAt(i)==strs[0].charAt(i)){
                    
                }else{
                    flag=false;
                    break;
                }
            }
            if(flag){
                index++;    
            }else{
                break;
            }
        }
        return strs[0].substring(0, index);
    }
}