class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long left = 1;
        long min = time[0];
        for(int t : time){
            min = Math.min(min, t);
        }
        long right = totalTrips * min;
        
        while(left<right){
            long mid = left + (right-left)/2;
            
            // How many trips we can do 
            long total = noOfTrips(time, mid);
            
            if(total<totalTrips){
                left = mid+1;
            }else{
                // we can reach total trips but we want right as samall as possible 
                // hence we can not add 1 to it 
                right = mid;   
            }
        }
        return left;    
        
    }
    
    public long noOfTrips(int[] time, long t){
        long count = 0;
        for(Integer i : time){
            count += (long)t/i;
        }
        return count;
    }
}