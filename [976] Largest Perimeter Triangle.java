class Solution {
    public int largestPerimeter(int[] n) {
        Arrays.sort(n);
        for(int i=n.length-1;i>=2;i--)
            if(n[i]+n[i-1]>n[i-2] && n[i]+n[i-2]>n[i-1] && n[i-2]+n[i-1]>n[i])
                return n[i]+n[i-1]+n[i-2];    
        return 0;    
    }
}
