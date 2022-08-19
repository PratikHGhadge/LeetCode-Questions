class Solution {
    public String[] findWords(String[] words) {
        String s1 = new String("qwertyuiop");
        String s2 = new String("asdfghjkl");
        String s3 = new String("zxcvbnm");
        ArrayList<String> ans = new ArrayList<>();
        String s = new String();
        for(String str : words){
            boolean temp1 = true;
            boolean temp2 = true;
            boolean temp3 = true;
            s = str.toLowerCase();
            for(int i = 0; i<s.length(); i++){
                if(!s1.contains(""+s.charAt(i))){
                    temp1 = false;
                    break;
                }
            }
            
            
            if(temp1 == true){
                ans.add(str);
            }
            for(int i = 0; i<s.length(); i++){
                if(!s2.contains(""+s.charAt(i))){
                    temp2 = false;
                    break;
                }
            }
            if(temp2 == true){
                ans.add(str);
            }
            
            for(int i = 0; i<s.length(); i++){
                if(!s3.contains(""+s.charAt(i))){
                    temp3 = false;
                    break;
                }
            }
            if(temp3 == true){
                ans.add(str);
            }
        }
        String[] ans1 = new String[ans.size()];
        for(int i = 0; i<ans.size(); i++){
            ans1[i] = ans.get(i);
        }
        return ans1;
    } 
}