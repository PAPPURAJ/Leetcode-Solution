class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] out=new int[encoded.length+1];
        out[0]=first;
        for(int i=1;i<=encoded.length;i++){
            out[i]=out[i-1]^encoded[i-1];
        }
        return out;

    }
}
