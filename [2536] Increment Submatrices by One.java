class Solution {
    
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] m=new int[n][n];

        for(int ii=0;ii<queries.length;ii++){
            int[] q=queries[ii];
            for(int j=q[0];j<=q[2];j++)
                for(int i=q[1];i<=q[3];i++)
                     m[j][i]++;
            }
        return m;        
    }
}
