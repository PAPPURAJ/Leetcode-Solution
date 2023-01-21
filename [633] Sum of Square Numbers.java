class Solution {
    public boolean judgeSquareSum(int c) {
        long v,start=0,end=(long)Math.sqrt(c);
        while(start<=end){
            v=start*start + end*end;
             if(v==c)
                return true;    
            if(v>c)
                end--;
            else start++;    
        }
        return false;
    }
}
