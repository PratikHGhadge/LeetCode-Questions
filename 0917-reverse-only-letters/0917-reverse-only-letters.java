class Solution {
    public String reverseOnlyLetters(String s) {
        int i=0, j=s.length()-1;
        char[] arr = s.toCharArray();
        while(i<=j){
            if(!Character.isLetter(arr[i])){
                i++;
                continue;
            }else if(!Character.isLetter(arr[j])){
                j--;
                continue;
            }else{
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            
        }
        return new String(arr);
    }
}