class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i = 1;
        int x = 0;
        List<Integer> list = new ArrayList<>();
        while(list.size()<=k){
            if(x<arr.length && arr[x]==i){
                x++;
            }else{
                list.add(i);
            }
            i++;
        }
        return list.get(k-1);
    }
    
}