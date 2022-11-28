class Solution {
    public boolean isSameAfterReversals(int num) {
        int t=num,t2=0;
        while(t>0){
            t2=t2*10+t%10;
            t/=10;
        }
        t=t2;
        t2=0;
        while(t>0){
            t2=t2*10+t%10;
            t/=10;
        }
        return t2==num;
        
        
    }
}
