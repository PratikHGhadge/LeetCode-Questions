class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int minDiff = Math.abs(arr[1] - arr[0]);
        for(int k = 1; k<arr.length; k++){
            if(Math.abs(arr[k]-arr[k-1])<minDiff){
                minDiff = arr[k]-arr[k-1];
            }
        }
        for(int k = 1; k<arr.length; k++){
            if(Math.abs(arr[k]-arr[k-1])==minDiff){
                List<Integer> list = new ArrayList<>();
                list.add(arr[k-1]);
                list.add(arr[k]);
                ans.add(list);
            }
        }
        return ans;
    }
}