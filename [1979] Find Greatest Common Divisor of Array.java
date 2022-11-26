class Solution {
    public int findGCD(int[] nums) {
        int s=nums[0],l=s,out=0;

        for(int i=1;i<nums.length;i++){
            if(s>nums[i])
                s=nums[i];
            if(l<nums[i])
                l=nums[i];    
        }

        for(int i=1;i<=s && i<=l;i++){
            if(s%i==0 && l%i==0)
                out=i;
        }
        return out;
        
    }
}
