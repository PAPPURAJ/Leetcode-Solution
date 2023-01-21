class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a, b) ->(a[1]-b[1]==0?(a[0]-b[0]):(a[1]-b[1])));

        int[] out=new int[k];
        int t;
        for(int i=0;i<mat.length;i++){
            t=0;
            for(int j=0;j<mat[0].length;j++)
                    t+=mat[i][j];

             pq.add(new int[]{i,t});

        t=0;
        while(k-->0)
            out[t++]=pq.poll()[0];
        
        return out;
        
    }
}
