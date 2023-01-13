class Solution {
    public int maxProfit(int[] p) {
        int s=p[0],l=p[0],out=0;

        for(int i:p){
            if(s>i){
                  s=i;
                  l=i;
            }
            if(i>l)
                l=i;   
            out=Math.max(out,l-s);      
        }
        return out;

    }
}
