class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                return b-a;
            }
        });
        for(Integer temp : nums){
            pq.add(temp);
        }
        for(int i = 0; i<k-1; i++){
            pq.poll();
        }
        return pq.poll();
    }
}