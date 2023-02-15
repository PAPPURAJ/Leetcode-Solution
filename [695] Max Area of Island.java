class Solution {
int t=0;
    void trav(int[][] g, int i, int j){
        if(i<0 || j<0 || i>=g.length || j>=g[0].length || g[i][j]==0)return;
        g[i][j]=0;
        t++;
        trav(g,i+1,j);
        trav(g,i-1,j);
        trav(g,i,j+1);
        trav(g,i,j-1);
    }


    public int maxAreaOfIsland(int[][] grid) {
        int out=0;
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++)
                if(grid[i][j]==1){
                    t=0;
                    trav(grid, i, j);
                    out=Math.max(out,t);
                    
                }
        return out;
    }
}
