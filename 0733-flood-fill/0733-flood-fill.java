class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // Avoid infinite loop if the new and old colors are the same...
        if(image[sr][sc]==color) return image;
        // Run the fill function starting at the position given...
        fill(image, sr, sc, color, image[sr][sc]);
        return image;
    }
    
    public static void fill(int[][] image, int sr, int sc, int color, int currColor){
        if(sr>=image.length || sc>=image[0].length || sr<0 || sc<0 ){
            return ;
        }
        // If image[sr][sc] is not equal to previous color...
        if(image[sr][sc] != currColor){
             return;
        }
        // If image[sr][sc] is not equal to previous color...
        image[sr][sc] = color;
        //up
        fill(image, sr-1, sc, color, currColor);
        //down
        fill(image, sr+1, sc, color, currColor);
        //left
        fill(image, sr, sc-1, color, currColor);
        //right
        fill(image, sr, sc+1, color, currColor);
    }
}