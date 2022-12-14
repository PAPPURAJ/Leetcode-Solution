class Solution {
    public int reverse(int x) {
        long out=0;
        while(x!=0){
                out=(out*10)+(x%10);
                x/=10;
            }
        return out<-2147483648 || out>2147483647?0:(int)out;
    }
}
