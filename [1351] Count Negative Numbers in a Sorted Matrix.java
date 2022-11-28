//Fastest
class Solution {
    public int countNegatives(int[][] grid) {
        int r=grid.length,c=grid[0].length,i=r-1,j=0,out=0;

        while(i>-1 && j<c){
            if(grid[i][j]>-1)
                j++;
            else{
                out+=c-j;
                i--;
            }    
        }return out;            
    }
}


//Slower Code
class Solution {
    public int countNegatives(int[][] grid) {
        int out=0;
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[i].length;j++)
                if(grid[i][j]<0)
                    out++;
        return out;               
        
    }
}
