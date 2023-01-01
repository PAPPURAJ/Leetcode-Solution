class Solution {
    public int countDigits(int num) {
        int out=0, d,t=num;
        
        while(num>0){
            d=num%10;
            num/=10;
            if(t%d==0)
                    out++;
        }
        return out;
    }
}
