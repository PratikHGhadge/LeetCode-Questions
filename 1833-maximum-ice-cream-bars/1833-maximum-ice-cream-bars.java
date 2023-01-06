class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int maxCost = 0;
        for(int i = 0; i<costs.length; i++){
            if(maxCost+costs[i]>coins){
                return i;
            }
            maxCost+=costs[i];
        }
        return costs.length;
    }
}