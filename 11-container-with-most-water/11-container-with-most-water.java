class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0; 
        int right = height.length-1;
        while(left<right){
            int l = Math.min(height[left], height[right]);
            int b = right-left;
            int a = l*b;
            max = Math.max(max, a);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}