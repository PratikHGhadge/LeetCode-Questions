class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.putIfAbsent(arr[i], 1);
            }
        }
        Integer max = -1;
        for(Integer key : map.keySet()){
            if(map.get(key)==key && key>max){
                max = key;
            }
        }
        return max;
    }
}