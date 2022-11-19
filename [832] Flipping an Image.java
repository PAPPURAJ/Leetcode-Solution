class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            int len=image[i].length,tem;

            for(int j=0;j<len/2;j++){
                tem=image[i][j];
                image[i][j]=image[i][len-j-1];
                image[i][len-j-1]=tem;

            }
            for(int j=0;j<len;j++)
                image[i][j]=image[i][j]==1?0:1;   
        }
        return image;
    }
}
