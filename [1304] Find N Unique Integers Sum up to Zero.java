class Solution {
    public int[] sumZero(int n) {
        int[] out=new int[n];
        int j=0;
        for(int i=-(n/2);i<=n/2;i++){
            if(n%2==0 && i==0)continue;
            out[j++]=i;
        }
        return out;
    }
}
