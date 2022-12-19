class Solution {
    public double myPow(double x, int n) {
     
        if(n==0)return 1;
        if(n<0){
            n=-n;
            x=1/x;
        }
        int t=Math.abs(n);
        double val;
        if(n%2==0){
            val= myPow(x, t/2);
            val*=val;
        }
            
        else{
             val= myPow(x, t/2);
             val*=val;
             val*=x;   
        }
        if(val<-10000 || val>10000)
            return 0;
        return val;
        
    }
}
