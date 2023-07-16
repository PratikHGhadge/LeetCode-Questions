class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b)->(b.getValue()-a.getValue()));
        pq.addAll(map.entrySet());
        StringBuilder ans = new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry<Character, Integer> head = pq.poll();
            int freq = head.getValue();
            char ch = head.getKey();
            while(freq!=0){
                ans.append(ch);
                freq--;
            }
        }
        return ans.toString();
    }
}