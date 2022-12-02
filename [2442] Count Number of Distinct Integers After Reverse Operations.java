class Solution {
    int rev(int in){
        int out=0;
        while(in>0){
             out=out*10+in%10;
             in/=10;
        }return out;
    }

    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
            set.add(rev(i));
        }return set.size();
    }
}
