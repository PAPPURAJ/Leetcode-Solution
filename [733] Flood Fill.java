class Solution {

    void change(int[][] image, int r, int c, int prevC,int nextC){
        if(r<0 || c<0 || r>=image.length || c>=image[0].length || image[r][c]==nextC || image[r][c]!=prevC)return;

        image[r][c]=nextC;
        change(image, r, c+1, prevC,nextC);
        change(image, r, c-1, prevC,nextC);
        change(image, r+1, c, prevC,nextC);
        change(image, r-1, c, prevC,nextC); 
        
    }

    public int[][] floodFill(int[][] image, int row, int column, int color) {
        change(image, row, column, image[row][column], color);
        return image;
    }
} 
