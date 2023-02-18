class Solution {
    public int nearestValidPoint(int x, int y, int[][] p) {
        int out=-1,dis=Integer.MAX_VALUE,t;
        for(int i=0;i<p.length;i++){
            if(x==p[i][0] || y==p[i][1]){
                t=Math.abs(x-p[i][0])+Math.abs(y-p[i][1]);
                if(t<dis){
                    dis=t;
                    out=i;
                }
            }
        }
        return out;
    }
}
