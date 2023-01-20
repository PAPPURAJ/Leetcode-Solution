class Solution {

    public int mySqrt(int x) {
        long i=1,j=x,mid=(i+j)/2;

        while(i<=j){
            if(mid*mid==x)
                break;
            else if(mid*mid>x)    
                j=mid-1;
            else
                i=mid+1;  
                  
            mid=(i+j)/2;
        }
        return (int)mid;
    }
}
