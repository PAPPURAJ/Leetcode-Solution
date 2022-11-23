class Solution {
    public int largestAltitude(int[] gain) {
        int p=0,out=0;
        for(int i=0;i<gain.length;i++){
            p=p+gain[i];
            System.out.println(p);
            if(out<p)out=p;
        }
        return out;
    }
}
