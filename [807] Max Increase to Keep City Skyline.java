class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int[] r=new int[m];
        int[] c=new int[n];
        int out=0;

        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                r[i]=Math.max(r[i], grid[i][j]);
                c[j]=Math.max(c[j], grid[i][j]);
            }
        }

        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               out+=Math.min(r[i], c[j])-grid[i][j];
            }
        }
        return out;
        
        
    }
}
