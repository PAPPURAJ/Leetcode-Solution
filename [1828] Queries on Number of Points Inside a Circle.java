class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int len=queries.length;
        int[] out=new int[len];

        for(int i=0;i<len;i++){
            int s=0;
            for(int[] p:points)
                if(Math.sqrt(Math.pow(p[0]-queries[i][0], 2)+Math.pow(p[1]-queries[i][1], 2))<=queries[i][2]*1.00)s++;  
            out[i]=s;
        }
        return out;
    }
}
