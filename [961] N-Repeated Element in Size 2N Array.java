class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> v=new HashSet<>();

        for(int i:nums){
            if(v.contains(i))
                return i;
            v.add(i);    
        }return 0;
    }
}
