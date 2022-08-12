class Solution {
    public boolean areNumbersAscending(String s) {
        String[] arr = s.split(" ");
        int temp = 0;
        for(int i = 0; i<arr.length; i++){
            int result;
            try {
                result = Integer.parseInt(arr[i]);
                if(result<=temp){
                    return false;
                }
            }
            catch (NumberFormatException e) {
                    result = temp;
                }
            temp=result;
        }
        return true;
    }  
}