class Solution {
    public int heightChecker(int[] heights) {

        if(heights.length==0)return 0;

        int out=0,len=heights.length;

        int[] t=heights.clone();
        Arrays.sort(t);

        for(int i=0;i<len;i++){
            if(heights[i]!=t[i])
                out++;
        }

        return out;
        
    }
}
