class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<points.length; i++){
            set.add(points[i][0]);
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        System.out.print(list);
        int ans = 0;
        for(int i=0; i<list.size()-1; i++){
            int diff = list.get(i+1)-list.get(i);
            ans = Integer.max(ans, diff);
        }
        return ans;
        
    }
}