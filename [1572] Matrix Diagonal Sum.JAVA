class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0,len=mat.length;
        for(int i=0;i<len;i++)
            sum+=mat[i][i];

        for(int i=0;i<len;i++){
               if(len/2==i && len%2==1)
                    continue;
                sum+=mat[i][len-i-1];
        }
         
        return sum;
    }
}
