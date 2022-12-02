class Solution {
    public int[] findArray(int[] pref) {
        int len=pref.length;
        int [] out=new int[len];
        out[0]=pref[0];
        for(int i=1;i<len;i++)
            out[i]=pref[i]^pref[i-1];
        return out;
    }
}
