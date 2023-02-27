class Solution {
    public int[] sortByBits(int[] arr) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((i,j)->(Integer.bitCount(i)-Integer.bitCount(j)==0?i-j:Integer.bitCount(i)-Integer.bitCount(j)));
        int[] out=new int[arr.length];
        int ii=0;

        for(int i:arr)
            pq.add(i);
        
        while(!pq.isEmpty())
            out[ii++]=pq.poll();
        
        return out;
    }
}
