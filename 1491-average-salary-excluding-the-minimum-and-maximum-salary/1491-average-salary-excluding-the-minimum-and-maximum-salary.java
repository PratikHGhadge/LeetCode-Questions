class Solution {
    public double average(int[] salary) {
        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;
        int n = salary.length;
        double sum = 0;
        for(int i = 0; i < n; i++){
            if(salary[i]<min){
                min = salary[i];
            }
            if(salary[i]>max){
                max = salary[i];
            }
            sum += salary[i];
        }
        sum = sum -(min+max);
        return sum/(n-2);
    }
}
    
    
    
    
    
    
    
    
    
    
