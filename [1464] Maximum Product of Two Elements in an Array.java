class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        return (nums[len-1]-1)*(nums[len-2]-1);
        
    }
}
