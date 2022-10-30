/*

  Problem Link: https://leetcode.com/problems/running-sum-of-1d-array/
  Solution Link: https://youtu.be/39fOLWMt9WE

*/



class Solution {
    public int[] runningSum(int[] nums) {
        
        int[] out = new int[nums.length];
          
            
        for(int i=0;i<nums.length;i++){
            int t=0;  
            for(int j=0;j<=i;j++){
                t+=nums[j];
                
            }
            
            out[i]=t;
        }
        
        return out;
    }
}
