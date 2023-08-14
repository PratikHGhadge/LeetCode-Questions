class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] newArr =  Arrays.copyOf(arr, n);
        Arrays.sort(newArr);
        Map<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for(int i = 0; i<n; i++){
            map.put(newArr[i], rank);
            if(i!=n-1 && newArr[i+1]!=newArr[i]){
                rank++;
            }
        }
        for(int i = 0; i<n; i++){
            arr[i] = map.get(arr[i]);
        }
        return arr;
        
    }
}