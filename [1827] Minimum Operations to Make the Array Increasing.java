class Solution {
    public int minOperations(int[] nums) {
        int t=nums[0],out=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>t){
                t=nums[i];
            }else{
                t++;
                out+=t-nums[i];
            }
        }
        return out;
    }
}
