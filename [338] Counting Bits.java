class Solution {
    public int[] countBits(int n) {
        int[] out=new int[n+1];

        for(int i=0;i<=n;i++){
            int c=0,t=i;
            while(t>0){
                c+=t&1;
                t=t>>1;
            }
            out[i]=c;
        }return out;
        
    }
}
