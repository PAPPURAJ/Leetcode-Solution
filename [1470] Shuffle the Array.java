class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] out=new int[n*2];
        int p=0;

        for(int i=0;i<n*2;i++){
            out[i]=i%2==0?nums[p]:nums[p+++n];
        }
        return out;
    }
}
