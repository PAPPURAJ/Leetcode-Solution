class Solution {
    int bs(int[] n, int i, int j, int t){
        if(i>j)return -1;
        int m=(i+j)/2;
        if(n[m]==t)
            return m;
        return Math.max(bs(n,i,m-1,t), bs(n,m+1,j,t));
        
    }

    public int search(int[] nums, int target) {
            return bs(nums,0,nums.length-1,target);    
    }
}
