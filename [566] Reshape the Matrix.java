class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int a=mat.length,b=mat[0].length,p=0,q=0;
        if(a*b != r*c)
            return mat;
        int[][] out=new int[r][c];    

        for(int i=0;i<a;i++)
            for(int j=0;j<b;j++){
                out[p][q++]=mat[i][j];
                if(q==c){
                    q=0;
                    p++;
                }
            }   
        return out;     
    }
}
