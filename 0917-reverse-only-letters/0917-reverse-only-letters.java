class Solution {
    public String reverseOnlyLetters(String s) {
        int i=0, j=s.length()-1;
        char[] arr = s.toCharArray();
        while(i<=j){
            if(!((arr[i]>='a' && arr[i]<='z') || (arr[i]>='A' && arr[i]<='Z')) ){
                i++;
                continue;
            }else if(!((arr[j]>='a' && arr[j]<='z') || (arr[j]>='A' && arr[j]<='Z')) ){
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