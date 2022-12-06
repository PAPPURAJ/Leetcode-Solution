class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int [][] r=new int[2][m];
        int [][] c=new int[2][n];
        
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++){
                r[grid[i][j]][i]++;
                c[grid[i][j]][j]++;
            }
        

        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                grid[i][j]=r[1][i]+c[1][j]-r[0][i]-c[0][j];
            
        
        return grid;
    }
}
