class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> ans = new LinkedList<Integer>();
        int len = num.length-1;
        while(len>=0 || k!=0){
            if(len>=0){
                k+=num[len--];
            }
            ans.addFirst(k%10);
            k/=10;
        }
        return ans;
    }
}



