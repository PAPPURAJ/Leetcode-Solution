class Solution {
    int r=0,c=0;
    int calMat(int[][] mat,int pos,int target){
        if(mat[pos/c][pos%c]==target)
            return 0;
        else if(mat[pos/c][pos%c]<target)
            return 1;    
        return -1;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
      
        r=matrix.length;
        c=matrix[0].length;  
        int i=0,j=r*c-1,mid=(i+j)/2;

        while(i<=j){
            int cal=calMat(matrix,mid,target);

            if(cal==0)
                return true;
            else if(cal>0)
                i=mid+1;
            else 
                j=mid-1;
           
            mid=(i+j)/2;
        }

        return false;
    }
}
