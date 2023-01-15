class Solution {
  
    int minSum(int[] s){
        int out=0;
        for(int i:s){
            while(i>0){
                out+=i%10;
                i/=10;
            }
        }
        return out;
    }

    int maxSum(int[] s){
        int out=0;
        for(int i:s){
            out+=i;
        }
        return out;
    }
    
    public int differenceOfSum(int[] nums) {
        return maxSum(nums)-minSum(nums);
    }
}
