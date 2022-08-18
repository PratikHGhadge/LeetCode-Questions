class Solution {
    public int minSetSize(int[] arr) {
         Map<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        Iterator <Integer> it = map.values().iterator(); 
        ArrayList<Integer> list = new ArrayList<>();
        while(it.hasNext()){
            list.add(it.next());
        }
        Collections.sort(list, Collections.reverseOrder());
        int count = 0;
        int n = arr.length;
        int i = 0;
        int totalEL = arr.length;
        while(totalEL>(n/2)){
            totalEL = totalEL-list.get(i);
            count++;
            i++;
        }
        return count;
    }
}