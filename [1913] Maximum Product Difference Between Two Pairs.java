class Solution {
    public int maxProductDifference(int[] nums) {
        int len=nums.length;
        Arrays.sort(nums);
        return nums[len-1]*nums[len-2]-nums[0]*nums[1];

    }
}
