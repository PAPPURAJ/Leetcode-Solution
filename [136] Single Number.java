class Solution {
    public int singleNumber(int[] nums) {
        int out=0;
        for(int i:nums) out^=i;
        return out;            
    }
}
