class Solution {
    public void rotate(int[] nums, int k) {
        
        int len=nums.length,t=0,j=0;
        if(len-k<0)
           k=Math.abs(len-k)%len;
        int[] out=new int[len];
        
        for(int i=len-k;i<len;i++)
            out[t++]=nums[i];
        for(int i=0;i<len-k;i++)
            out[t++]=nums[i];
            
        for(int a:out)
            nums[j++]=a;
    }
}
